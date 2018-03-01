package pe.edu.pe.javawebuserlist.models;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SubscribersEntity extends BaseEntity
{
    private static String DEFAULT_SQL ="SELECT * FROM pt_mysql.suscribers";
    private List<Subscriber>findByCriteria(String sql){
        List<Subscriber> subscribers;
        if (getConnection() !=null){
            subscribers = new ArrayList<>();
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next()){
                    Subscriber subscriber = new Subscriber().setId(resultSet.getString("id_subscribers"));
                }

            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        return null;
    }
    public List<Subscriber>findAll(){
        return findByCriteria(DEFAULT_SQL);
    }
    public Subscriber findById(String id){
        List<Subscriber> subscribers = findByCriteria(DEFAULT_SQL+"WHERE id_subscribers ="+ String.valueOf(id));
        return (subscribers !=null ? subscribers.get(0): null);
    }


}
