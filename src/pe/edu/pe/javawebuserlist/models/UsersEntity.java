package pe.edu.pe.javawebuserlist.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersEntity extends BaseEntity
{
    private static String DEFAULT_SQL = "SELECT * FROM pt.users";

    public List<User> findByCriteria(String sql) {
        List<User> users;
        if (getConnection() != null) {
            users = new ArrayList<>();
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next()) {
                    User user = new User()
                            .setId(resultSet.getInt("user_id"))
                            .setFirstName(resultSet.getString("user_firstname"))
                            .setLastName(resultSet.getString("user_lastname"));
                    users.add(user);
                }
                return users;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /*public List<User> findAll()
    {
        return findByCriteria(DEFAULT_SQL);
    }*/

    public User findById(int id)
    {
        List<User> users = findByCriteria(DEFAULT_SQL+"WHERE id_user= " +String.valueOf(id));
        return(users != null ? users.get(0):null);
    }

    public User findByNickPass(String nickname, String password)
    {
        List<User> users = findByCriteria(DEFAULT_SQL+"WHERE user_nickname= '"+nickname+
                "' AND user_password= '"+password+"'");
        return(users != null ? users.get(0): null);
    }

    /*public User findAll(String firstName)
    {
        List<User> users = findByCriteria(DEFAULT_SQL+"WHERE first_name= '"+firstName+"'");
        return(users != null ? users.get(0): null);
    }*/

    /*private int updateByCriteria(String sql)
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
    }*/

   /* private String getId()
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
    }*/

    public User create(User user) {
        if (getConnection() != null) {
            try {
                String sql = "INSERT INTO users(user_id,user_nickname,user_password,user_firstname,user_lastname,user_email,user_phone,user_description)"
                        +"VALUES('"+user.getId()+"','"+ user.getNickname()+"','"+user.getPassword()+"','"+user.getFirstName()+"','"+user.getLastName()+"'," +
                        "'"+user.getEmail()+"','"+user.getPhone()+"','"+user.getDescription()+"')";
                getConnection().createStatement().execute(sql);
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return null;
    }

    /*public boolean update(User user) {
        if (findByFirstname(user.getFirstName()) != null) return false;
        return updateByCriteria("UPDATE users SET first_name= '"+
        user.getFirstName()+"'"+"WHERE id_user="+
        String.valueOf(user.getId()))>0;
    }*/
}