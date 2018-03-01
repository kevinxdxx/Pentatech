package pe.edu.pe.javawebuserlist.models;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SubscribersEntity extends BaseEntity
{
    private static String DEFAULT_SQL ="SELECT * FROM pt.subscribers";
    private List<Subscriber>findByCriteria(String sql,UsersEntity usersEntity, AccountsEntity accountsEntity,
                                           GendersEntity gendersEntity){
        List<Subscriber> subscribers;
        if (getConnection() !=null){
            subscribers = new ArrayList<>();
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next()){
                    Subscriber subscriber = new Subscriber(
                            resultSet.getInt("subscriber_id"),
                            resultSet.getInt("subscriber_quantity"),
                            usersEntity.
                                    findById(resultSet
                                            .getInt("user_id"),accountsEntity,gendersEntity));
                }

            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        return null;
    }
    public List<Subscriber>findAll(UsersEntity usersEntity, AccountsEntity accountsEntity,
                                   GendersEntity gendersEntity){
        return findByCriteria(DEFAULT_SQL,usersEntity,accountsEntity,gendersEntity);
    }
    public Subscriber findById(int id,UsersEntity usersEntity, AccountsEntity accountsEntity,
                               GendersEntity gendersEntity){
        List<Subscriber> subscribers = findByCriteria(DEFAULT_SQL+"WHERE subscriber_id ="+ String.valueOf(id),
                usersEntity,accountsEntity,gendersEntity);
        return (subscribers !=null ? subscribers.get(0): null);
    }


}
