package pe.edu.pe.javawebuserlist.models;

import java.sql.Connection;
import java.util.List;

public class PtService
{
    private Connection connection;
    private UsersEntity usersEntity;

    private Connection getConnection()
    {
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
        return getConnection() != null ? getUsersEntity().findAll() : null;
    }

    public User findUserById(String id)
    {
        return getConnection() != null ? getUsersEntity().findById(id) : null;
    }

    public User findUserByFirstname(String firstName)
    {
        return getConnection() != null ? getUsersEntity().findByFirstname(firstName) : null;
    }

    public User createUser(String firstName)
    {
        return getConnection() != null ? getUsersEntity().create(firstName) : null;
    }

    public boolean updateUser(User user)
    {
        return getConnection() != null ? getUsersEntity().update(user) : false;
    }
}
