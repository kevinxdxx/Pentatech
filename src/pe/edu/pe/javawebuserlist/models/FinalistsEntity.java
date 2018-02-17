package pe.edu.pe.javawebuserlist.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FinalistsEntity extends BaseEntity
{
    private static String DEFAULT_SQL = "SELECT * FROM pt_mysql.finalists";
    private List<Finalist> findByCriteria(String sql)
    {
        List<Finalist> finalists;
        if (getConnection() !=null)
        {
            finalists =  new ArrayList<>();
            try
            {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next())
                {
                    Finalist finalist = new Finalist().setId(resultSet.getString("id_finalist"));
                }
            } catch (SQLException e)
            {
                e.printStackTrace();
            }

        }
        return null;
    }

    public List<Finalist> findAll()
    {
        return findByCriteria(DEFAULT_SQL);
    }
    public Finalist findById(String id)
    {
        List<Finalist> finalists = findByCriteria(DEFAULT_SQL+ "WHERE id_finalist = "+ String.valueOf(id));
        return (finalists != null ? finalists.get(0): null);
    }
}