package pe.edu.pe.javawebuserlist.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class PtService
{
    private Connection connection;
    private UsersEntity usersEntity;
    private AccountsEntity accountsEntity;
    private GendersEntity gendersEntity;
    private CommentsEntity commentsEntity;
    private EventsEntity eventsEntity;
    private MediacontentsEntity mediacontentsEntity;
    private PlacesEntity placesEntity;
    private PosteventsEntity posteventsEntity;
    private SuscriptionsEntity suscriptionsEntity;
    private FinalistsEntity finalistsEntity;

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

    protected UsersEntity getUsersEntity() {
        if (getConnection() != null) {
            if (usersEntity == null) {
                usersEntity = new UsersEntity();
                usersEntity.setConnection(getConnection());
            }
        }
        return usersEntity;
    }

    protected AccountsEntity getAccountsEntity() {
        if (getConnection() != null) {
            if (accountsEntity == null) {
                accountsEntity = new AccountsEntity();
                accountsEntity.setConnection(getConnection());
            }
        }
        return accountsEntity;
    }

    protected GendersEntity getGendersEntity() {
        if (getConnection() != null) {
            if (gendersEntity == null) {
                gendersEntity = new GendersEntity();
                gendersEntity.setConnection(getConnection());
            }
        }
        return gendersEntity;
    }

    protected CommentsEntity getCommentsEntity() {
        if (getConnection() != null) {
            if (commentsEntity == null) {
                commentsEntity = new CommentsEntity();
                commentsEntity.setConnection(getConnection());
            }
        }
        return commentsEntity;
    }

    protected EventsEntity getEventsEntity() {
        if (getConnection() != null) {
            if (eventsEntity == null) {
                eventsEntity = new EventsEntity();
                eventsEntity.setConnection(getConnection());
            }
        }
        return eventsEntity;
    }

    protected MediacontentsEntity getMediacontentsEntity() {
        if (getConnection() != null) {
            if (mediacontentsEntity == null) {
                mediacontentsEntity = new MediacontentsEntity();
                mediacontentsEntity.setConnection(getConnection());
            }
        }
        return mediacontentsEntity;
    }

    protected PlacesEntity getPlacesEntity() {
        if (getConnection() != null) {
            if (placesEntity == null) {
                placesEntity = new PlacesEntity();
                placesEntity.setConnection(getConnection());
            }
        }
        return placesEntity;
    }

    protected PosteventsEntity getPosteventsEntity() {
        if (getConnection() != null) {
            if (posteventsEntity == null) {
                posteventsEntity = new PosteventsEntity();
                posteventsEntity.setConnection(getConnection());
            }
        }
        return posteventsEntity;
    }

    protected SuscriptionsEntity getSuscriptionsEntity() {
        if (getConnection() != null) {
            if (suscriptionsEntity == null) {
                suscriptionsEntity = new SuscriptionsEntity();
                suscriptionsEntity.setConnection(getConnection());
            }
        }
        return suscriptionsEntity;
    }

    protected FinalistsEntity getFinalistsEntity() {
        if (getConnection() != null) {
            if (finalistsEntity == null) {
                finalistsEntity = new FinalistsEntity();
                finalistsEntity.setConnection(getConnection());
            }
        }
        return finalistsEntity;
    }

    /*public List<User> findAllUsers()
    {
        return getUsersEntity() != null ?
                getUsersEntity().findAll() : null;
    }

    public User findUserByFirstname(String firstName)
    {
        return getUsersEntity() != null ?
                getUsersEntity().findByFirstname(firstName) : null;
    }*/

    public User createUser(User user) {
        return getUsersEntity() != null ?
                getUsersEntity().create(user) : null;
    }

    public Account createAccount(Account account)
    {
        return getAccountsEntity() != null ?
                getAccountsEntity().create(account) : null;
    }
    ////////////////////////////////////////////
    /*public List<User> findUserById(int id)
    {
        return getUsersEntity() != null ?
                getUsersEntity().findById() : null;
    }*/
}
