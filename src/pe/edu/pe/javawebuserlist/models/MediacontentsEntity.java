package pe.edu.pe.javawebuserlist.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MediacontentsEntity extends BaseEntity
{
    private static String DEFAULT_SQL = "SELECT * FROM pt_mysql.media_contents";

    private List<Mediacontent> findByCriteria(String sql){
        List<Mediacontent> mediacontents;
        if (getConnection() !=null){
            mediacontents =  new ArrayList<>();
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next()){
                    Mediacontent mediacontent = new Mediacontent().setId(resultSet.getString("id_media_contents"))
                            .setUrl(resultSet.getString("url"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return null;
    }

    public List<Mediacontent> findAll(){
        return findByCriteria(DEFAULT_SQL);
    }
    public Mediacontent findById(String id){
        List<Mediacontent> mediacontents = findByCriteria(DEFAULT_SQL+ "WHERE id_media_contents = "+ String.valueOf(id));
        return (mediacontents != null ? mediacontents.get(0): null);
    }

    public Mediacontent findByUrl(String url){
        List<Mediacontent> mediacontents = findByCriteria(DEFAULT_SQL + "WHERE url = " + String.valueOf(url));
        return (mediacontents != null ? mediacontents.get(0): null);
    }
}
