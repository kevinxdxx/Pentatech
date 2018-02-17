package pe.edu.pe.javawebuserlist.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommentsEntity extends BaseEntity
{
    private static String DEFAULT_SQL = "SELECT * FROM pt_mysql.comentarys";
    private List<Comment> findByCriteria(String sql)
    {
        List<Comment> comments;
        if (getConnection() != null)
        {
            comments = new ArrayList<>();
            try
            {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next())
                {
                    Comment comment = new Comment()
                            .setId(resultSet.getString("id_comentary"))
                            .setDescription(resultSet.getString("description"));
                    comments.add(comment);
                }
                return comments;
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        return null;
    }

    public List<Comment> findAll()
    {
        return findByCriteria(DEFAULT_SQL);
    }

    public Comment findById(String id) {
        List<Comment> comments = findByCriteria(DEFAULT_SQL +
                " WHERE id_comentary = "+ String.valueOf(id));
        return (comments != null ? comments.get(0) : null);
    }

    public Comment findByDescription(String description) {
        List<Comment> comments = findByCriteria(DEFAULT_SQL +
                " WHERE description = "+ String.valueOf(description));
        return (comments != null ? comments.get(0) : null);
    }

    public Comment findAll(String description){
        List<Comment> comments = findByCriteria(DEFAULT_SQL+
                "WHERE description = '"+description + "'");
        return(comments != null ? comments.get(0) : null);
    }

    private  int updatebycriteria(String sql)
    {
        if(getConnection() != null)
        {
            try
            {
                return  getConnection()
                        .createStatement()
                        .executeUpdate(sql);
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        return 0;
    }

    private String getId(){
        String sql = "SELECT(id_comentary) AS id FROM comentarys ";

        if(getConnection() != null){
            ResultSet resultSet = null;
            try {
                resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                return resultSet.next() ?
                        resultSet.getString("id_comentary") : null;
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return null;
    }

    public  Comment create(String description){
        if(findByDescription(description) == null){
            if(getConnection() != null){
                String sql = "INSERT INTO description(id_comentary,description)" +
                        "VALUES(" + String.valueOf(getId()) + ", '"+description+"')";
                int results = updatebycriteria(sql);
                if(results > 0){
                    Comment comment = new Comment();
                    return comment;
                }
            }
        }
        return null;
    }

    public boolean delete(int id){

        return updatebycriteria("DELETE FROM users WHERE id_comentary =" + String.valueOf(id)) > 0;
    }

    public boolean delete(String description){

        return updatebycriteria("DELETE FROM users WHERE description = '" + description + "'") > 0;
    }
}