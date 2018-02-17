package pe.edu.pe.javawebuserlist.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersEntity extends BaseEntity
{
    private static String DEFAULT_SQL = "SELECT * FROM pt_mysql.users";
    private List<User> findByCriteria(String sql)
    {
        List<User> users;
        if (getConnection() != null)
        {
            users = new ArrayList<>();
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next())
                {
                    User user = new User().setId(resultSet.getString("id_user"))
                            .setFirstName(resultSet.getString("first_name"));
                    users.add(user);
                }
                return users;
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        return null;
    }

    public List<User> findAll()
    {
        return findByCriteria(DEFAULT_SQL);
    }

    public User findById(String id)
    {
        List<User> users = findByCriteria(DEFAULT_SQL+"WHERE id_user= " +String.valueOf(id));
        return(users != null ? users.get(0):null);
    }

    public User findByFirstname(String firstName)
    {
        List<User> users = findByCriteria(DEFAULT_SQL+"WHERE first_name= '"+firstName+"'");
        return(users != null ? users.get(0): null);
    }

    public User findAll(String firstName)
    {
        List<User> users = findByCriteria(DEFAULT_SQL+"WHERE first_name= '"+firstName+"'");
        return(users != null ? users.get(0): null);
    }

    private int updateByCriteria(String sql)
    {
        if (getConnection() != null)
        {
            try
            {
                return getConnection().createStatement().executeUpdate(sql);
            }catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        return 0;
    }

    private String getId()
    {
        String sql = "SELECT(id_user) AS id FROM users";

        if (getConnection() != null)
        {
            ResultSet resultSet = null;
            try
            {
                resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                return resultSet.next() ? resultSet.getString("id"):null;
            }catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        return null;
    }

    public User create(String firstName)
    {
        if (findByFirstname(firstName) == null)
        {
            if (getConnection() != null)
            {
                String sql = "INSERT INTO users(id_user, first_name)"+"VALUES("+String.valueOf
                        (getId())+",'"+firstName+"')";
                int results = updateByCriteria(sql);
                if (results > 0)
                {
                    User user = new User();
                    return user;
                }
            }
        }
        return null;
    }

    public boolean update(User user) {
        if (findByFirstname(user.getFirstName()) != null) return false;
        return updateByCriteria("UPDATE users SET first_name= '"+
        user.getFirstName()+"'"+"WHERE id_user="+
        String.valueOf(user.getId()))>0;
    }
}