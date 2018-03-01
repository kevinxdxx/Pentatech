package pe.edu.pe.javawebuserlist.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlacesEntity extends BaseEntity
{
    private static String DEFAULT_SQL = "SELECT * FROM pt.places";

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
                    Place place = new Place().setId(resultSet.getInt("place_id"))
                            .setName(resultSet.getString("place_name"));
                }
                return places;
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
    public Place findById(int id){
        List<Place> places = findByCriteria(DEFAULT_SQL+ "WHERE place_id = "+ String.valueOf(id));
        return (places != null ? places.get(0): null);
    }

    public Place findByName(String name){
        List<Place> places = findByCriteria(DEFAULT_SQL + "WHERE place_name = '" +name+"'");
        return (places != null ? places.get(0): null);
    }
}

