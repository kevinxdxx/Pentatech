package pe.edu.pe.javawebuserlist.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GendersEntity extends BaseEntity
{
    private static String DEFAULT_SQL = "SELECT * FROM pt_mysql.genders";
    private List<Gender> findByCriteria(String sql)
    {
        List<Gender> genders;
        if (getConnection() !=null)
        {
            genders =  new ArrayList<>();
            try
            {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next())
                {
                    Gender gender = new Gender().setId(resultSet.getString("id_gender"))
                            .setDescription(resultSet.getString("description"));
                }
            } catch (SQLException e)
            {
                e.printStackTrace();
            }

        }
        return null;
    }

    public List<Gender> findAll(){
        return findByCriteria(DEFAULT_SQL);
    }
    public Gender findById(String id){
        List<Gender> genders = findByCriteria(DEFAULT_SQL+ "WHERE id_gender = "+ String.valueOf(id));
        return (genders != null ? genders.get(0): null);
    }

    public Gender findByDescription(String description){
        List<Gender> genders = findByCriteria(DEFAULT_SQL + "WHERE description = " + String.valueOf(description));
        return (genders != null ? genders.get(0): null);
    }
}
