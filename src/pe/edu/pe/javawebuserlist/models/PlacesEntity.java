package pe.edu.pe.javawebuserlist.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlacesEntity extends BaseEntity
{
    private static String DEFAULT_SQL = "SELECT * FROM pt_mysql.places";

    private List<Place> findByCriteria(String sql)
    {
        List<Place> places;
        if (getConnection() !=null)
        {
            places =  new ArrayList<>();
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next())
                {
                    Place place = new Place().setId(resultSet.getString("id_place"))
                            .setName(resultSet.getString("site"));
                }
            } catch (SQLException e)
            {
                e.printStackTrace();
            }

        }
        return null;
    }

    public List<Place> findAll(){
        return findByCriteria(DEFAULT_SQL);
    }
    public Place findById(String id){
        List<Place> places = findByCriteria(DEFAULT_SQL+ "WHERE id_place = "+ String.valueOf(id));
        return (places != null ? places.get(0): null);
    }

    public Place findByName(String name){
        List<Place> places = findByCriteria(DEFAULT_SQL + "WHERE site = " + String.valueOf(name));
        return (places != null ? places.get(0): null);
    }
}

