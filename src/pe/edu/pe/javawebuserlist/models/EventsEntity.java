package pe.edu.pe.javawebuserlist.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EventsEntity extends BaseEntity {
    private static String DEFAULT_SQL = "SELECT * FROM pt_mysql.events";

    private List<Event> findByCriteria(String sql){
        List<Event> events;
        if (getConnection() !=null){
            events =  new ArrayList<>();
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next()){
                    Event event = new Event().setId(resultSet.getString("id_event"))
                            .setDate(resultSet.getString("event_date"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return null;
    }
    public List<Event> findAll(){
        return findByCriteria(DEFAULT_SQL);
    }
    public Event findById(String id){
        List<Event> events = findByCriteria(DEFAULT_SQL+ "WHERE event_id = "+ String.valueOf(id));
        return (events != null ? events.get(0): null);
    }

    public Event findByDate(String date){
        List<Event> events = findByCriteria(DEFAULT_SQL + "WHERE event_date = " + String.valueOf(date));
        return (events != null ? events.get(0): null);
    }

}
