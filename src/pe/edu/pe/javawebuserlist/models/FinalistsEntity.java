package pe.edu.pe.javawebuserlist.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FinalistsEntity extends BaseEntity
{
    private static String DEFAULT_SQL = "SELECT * FROM pt.finalists";
    private List<Finalist> findByCriteria(String sql, SubscribersEntity subscribersEntity, EventsEntity eventsEntity,
                                          CommentsEntity commentsEntity, AccountsEntity accountsEntity,
                                          GendersEntity gendersEntity, PlacesEntity placesEntity,
                                          MediacontentsEntity mediacontentsEntity,UsersEntity usersEntity)
    {
        List<Finalist> finalists =new ArrayList<>();
        if (getConnection() !=null)
        {
            /*finalists =  new ArrayList<>();*/
            try
            {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next())
                {
                    Finalist finalist = new Finalist(resultSet.getInt("finalist_id"),
                            subscribersEntity.findById(resultSet
                                    .getInt("subscriber_id"),usersEntity,accountsEntity,gendersEntity),
                            eventsEntity.
                                    findById(resultSet
                                                    .getInt("event_id"),commentsEntity,accountsEntity,gendersEntity,
                                            usersEntity,placesEntity,mediacontentsEntity));
                /*.setId(resultSet.getString("id_finalist"));*/
                }
            } catch (SQLException e)
            {
                e.printStackTrace();
            }

        }
        return null;
    }

    public List<Finalist> findAll(SubscribersEntity subscribersEntity, EventsEntity eventsEntity,
                                  CommentsEntity commentsEntity, AccountsEntity accountsEntity,
                                  GendersEntity gendersEntity, PlacesEntity placesEntity,
                                  MediacontentsEntity mediacontentsEntity,UsersEntity usersEntity)
    {
        return findByCriteria(DEFAULT_SQL,subscribersEntity,eventsEntity,commentsEntity,accountsEntity,gendersEntity,
                placesEntity,mediacontentsEntity,usersEntity);
    }
    public Finalist findById(int id,SubscribersEntity subscribersEntity, EventsEntity eventsEntity,
                             CommentsEntity commentsEntity, AccountsEntity accountsEntity,
                             GendersEntity gendersEntity, PlacesEntity placesEntity,
                             MediacontentsEntity mediacontentsEntity,UsersEntity usersEntity)
    {
        List<Finalist> finalists = findByCriteria(DEFAULT_SQL+ "WHERE id_finalist = "+ String.valueOf(id),
                subscribersEntity,eventsEntity,commentsEntity,accountsEntity,gendersEntity, placesEntity,
                mediacontentsEntity,usersEntity);
        return (finalists != null ? finalists.get(0): null);
    }
}