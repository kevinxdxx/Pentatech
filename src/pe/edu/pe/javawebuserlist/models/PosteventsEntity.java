package pe.edu.pe.javawebuserlist.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PosteventsEntity extends BaseEntity
{
    private static String DEFAULT_SQL = "SELECT * FROM pt_mysql.postevents";

    private List<Postevent> findByCriteria(String sql)
    {
        List<Postevent> postevents;
        if (getConnection() !=null)
        {
            postevents =  new ArrayList<>();
            try
            {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next())
                {
                    Postevent postevent = new Postevent().setId(resultSet.getString("id_postevents"));
                }
            } catch (SQLException e)
            {
                e.printStackTrace();
            }

        }
        return null;
    }

    public List<Postevent> findAll()
    {
        return findByCriteria(DEFAULT_SQL);
    }

    public Postevent findById(String id)
    {
        List<Postevent> postevents = findByCriteria(DEFAULT_SQL+ "WHERE id_postevents = "+ String.valueOf(id));
        return (postevents != null ? postevents.get(0): null);
    }
}
