package pe.edu.pe.javawebuserlist.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EventsEntity extends BaseEntity {
    private static String DEFAULT_SQL = "SELECT * FROM pt.events";

    private List<Event> findByCriteria(String sql, CommentsEntity commentsEntity, AccountsEntity accountsEntity,
                                       GendersEntity gendersEntity, UsersEntity usersEntity, PlacesEntity placesEntity,
                                       MediacontentsEntity mediacontentsEntity){
        List<Event> events =  new ArrayList<>();
        if (getConnection() !=null){
           // events =  new ArrayList<>();
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next()){
                    Event event = new Event(
                            resultSet.getInt("event_id"),
                            resultSet.getString("event_date"),
                                    gendersEntity
                                            .findById(resultSet
                                                    .getInt("accounts_id")),
                                    placesEntity.
                                            findById(resultSet
                                                    .getInt("gender_id")),
                                    mediacontentsEntity.
                                            findById(resultSet
                                                    .getInt("mediacontent_id")),
                                    commentsEntity.
                                            findById(resultSet
                                                    .getInt("comment_id"),usersEntity,accountsEntity,gendersEntity));
                            /*.setDate(resultSet.getString("event_date"));*/
                }
                return events;
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return null;
    }
    public List<Event> findAll(CommentsEntity commentsEntity, AccountsEntity accountsEntity,
                               GendersEntity gendersEntity, UsersEntity usersEntity, PlacesEntity placesEntity,
                               MediacontentsEntity mediacontentsEntity){
        return findByCriteria(DEFAULT_SQL, commentsEntity,accountsEntity,gendersEntity,usersEntity,placesEntity,
                mediacontentsEntity);
    }
    public Event findById(int id,CommentsEntity commentsEntity, AccountsEntity accountsEntity,
                          GendersEntity gendersEntity, UsersEntity usersEntity, PlacesEntity placesEntity,
                          MediacontentsEntity mediacontentsEntity){
        List<Event> events = findByCriteria(DEFAULT_SQL+ "WHERE event_id = "+ String.valueOf(id),commentsEntity,
                accountsEntity,gendersEntity,usersEntity,placesEntity,mediacontentsEntity);
        return (events != null ? events.get(0): null);
    }

    public Event findByDate(String date, CommentsEntity commentsEntity, AccountsEntity accountsEntity,
                            GendersEntity gendersEntity, UsersEntity usersEntity, PlacesEntity placesEntity,
                            MediacontentsEntity mediacontentsEntity){
        List<Event> events = findByCriteria(DEFAULT_SQL + "WHERE event_date = " +date+"'",commentsEntity,
                accountsEntity,gendersEntity,usersEntity,placesEntity, mediacontentsEntity);
        return (events != null ? events.get(0): null);
    }

}
