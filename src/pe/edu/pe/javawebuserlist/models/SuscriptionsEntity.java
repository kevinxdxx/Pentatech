package pe.edu.pe.javawebuserlist.models;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SuscriptionsEntity extends BaseEntity
{
    private static String DEFAULT_SQL ="SELECT * FROM pt_mysql.suscribers";
    private List<Suscription>findByCriteria(String sql){
        List<Suscription> suscriptions;
        if (getConnection() !=null){
            suscriptions = new ArrayList<>();
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next()){
                    Suscription suscription = new Suscription().setId(resultSet.getString("id_subscribers"));
                }

            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        return null;
    }
    public List<Suscription>findAll(){
        return findByCriteria(DEFAULT_SQL);
    }
    public Suscription findById(String id){
        List<Suscription> suscriptions = findByCriteria(DEFAULT_SQL+"WHERE id_subscribers ="+ String.valueOf(id));
        return (suscriptions !=null ? suscriptions.get(0): null);
    }


}
