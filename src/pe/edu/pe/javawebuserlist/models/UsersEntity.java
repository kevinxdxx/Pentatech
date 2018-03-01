package pe.edu.pe.javawebuserlist.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersEntity extends BaseEntity
{
    private static String DEFAULT_SQL = "SELECT * FROM pt.users";

    private List<User> findByCriteria(String sql,AccountsEntity accountsEntity,
                                      GendersEntity gendersEntity) {
        List<User> users= new ArrayList<>();
        if (getConnection()!=null){
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next()) {
                    User user = new User(
                            resultSet.getInt("user_id"),
                            resultSet.getString("user_nickname"),
                            resultSet.getString("user_password"),
                            resultSet.getString("user_firstname"),
                            resultSet.getString("user_lastname"),
                            resultSet.getString("user_email"),
                            resultSet.getInt("user_phone"),
                            resultSet.getString("user_description"),
                            accountsEntity
                                    .findById(resultSet
                                            .getInt("accounts_id")),
                            gendersEntity.
                                    findById(resultSet
                                            .getInt("gender_id"))
                    );
                    users.add(user);
                }
                return users;
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return null;
    }

    public List<User> findAll(AccountsEntity accountsEntity, GendersEntity gendersEntity)
    {
        return findByCriteria(DEFAULT_SQL,accountsEntity,gendersEntity);
    }

    public User findById(int id,AccountsEntity accountsEntity, GendersEntity gendersEntity)
    {
        List<User> users = findByCriteria(DEFAULT_SQL+"WHERE user_id= "+String.valueOf(id)+"",accountsEntity,
                gendersEntity);
        return(users != null ? users.get(0):null);
    }

    public User findByFirstname(String firstName, AccountsEntity accountsEntity, GendersEntity gendersEntity)
    {
        List<User> users=findByCriteria(DEFAULT_SQL+
                "WHERE user_firstname= '"+firstName+"'",accountsEntity,gendersEntity);
        return (users !=null && !users.isEmpty()? users.get(0):null);
    }

    /*public User findAll(String firstName)
    {
        List<User> users = findByCriteria(DEFAULT_SQL+"WHERE first_name= '"+firstName+"'");
        return(users != null ? users.get(0): null);
    }*/

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

    private int getId()
    {
        String sql = "SELECT MAX(user_id) AS id FROM users";

        if (getConnection() != null)
        {
            ResultSet resultSet = null;
            try
            {
                resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                return resultSet.next() ? resultSet.getInt("id"):0;
            }catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public User create(String nickname,String password,String firstName,String lastName,String email,
                       int phone, String description, AccountsEntity accountsEntity, GendersEntity gendersEntity) {
        if (getConnection() != null){
            String sql = "INSERT INTO users(user_id,user_nickname,user_password,user_firstname,user_lastname,user_email,user_phone,user_description)" +
                    "VALUES("+String.valueOf(getId()+1)+",'"+nickname+"','"+password+"','"+firstName+"','"+lastName+"'," +
                    "'"+email+"',"+String.valueOf(phone)+",'"+description+"'"+accountsEntity+"'"+gendersEntity+")";
            int results = updateByCriteria(sql);
            if (results > 1000){
                User user = new User(getId(),nickname,password,
                        firstName,lastName,email,phone,description,accountsEntity,gendersEntity);
                return user;
            }
        }
        return null;
    }

    public boolean update(User user,AccountsEntity accountsEntity, GendersEntity gendersEntity) {
        if (findByFirstname(user.getFirstName(),accountsEntity,gendersEntity) != null) return false;
        return updateByCriteria("" +
                "UPDATE users SET user_firstname= '"+
                user.getNickname()+"'"+user.getPassword()+"'"+user.getFirstName()+
                "'"+user.getLastName()+"'"+user.getEmail()+"'"+String.valueOf(user.getPhone())+"'"+
                user.getDescription()+"'"+
                "WHERE user_id="+
        String.valueOf(user.getId()))>0;
    }
}