package pe.edu.pe.javawebuserlist.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class PtService
{
    private Connection connection;
    private UsersEntity usersEntity;

    private Connection getConnection()
    {
        if(connection == null) {
            try {
                connection = ((DataSource) InitialContext.doLookup("jdbc/MySQLDataSource")).getConnection();
            }catch (NamingException | SQLException e){
                e.printStackTrace();

            }
        }
        return connection;
    }

    public void setConnection(Connection connection)
    {
        this.connection = connection;
    }

    protected UsersEntity getUsersEntity()
    {
        if (getConnection() != null)
        {
            if (usersEntity == null)
            {
                usersEntity = new UsersEntity();
                usersEntity.setConnection(getConnection());
            }
        }
        return usersEntity;
    }

    public List<User> findAllUsers()
    {
        return getUsersEntity() != null ?
                getUsersEntity().findAll() : null;
    }

    public User findUserById(String id)
    {
        return getUsersEntity() != null ?
                getUsersEntity().findById(id) : null;
    }

    public User findUserByFirstname(String firstName)
    {
        return getUsersEntity() != null ?
                getUsersEntity().findByFirstname(firstName) : null;
    }

    public User createUser(String firstName)
    {
        return getUsersEntity() != null ?
                getUsersEntity().create(firstName) : null;
    }

    public boolean updateUser(User user)
    {
        return getUsersEntity() != null ?
                getUsersEntity().update(user) : false;
    }
}
