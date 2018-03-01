package pe.edu.pe.javawebuserlist.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommentsEntity extends BaseEntity
{
    private static String DEFAULT_SQL = "SELECT * FROM pt.comments";
    private List<Comment> findByCriteria(String sql,UsersEntity usersEntity,AccountsEntity accountsEntity,
                                         GendersEntity gendersEntity)
    {
        List<Comment> comments = new ArrayList<>();
        if (getConnection() != null)
        {
            /*comments = new ArrayList<>();*/
            try
            {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while (resultSet.next())
                {
                    Comment comment = new Comment(
                            resultSet.getInt("comment_id"),
                            resultSet.getString("comment_description"),
                            resultSet.getString("created_in"),
                            usersEntity.
                                    findById(resultSet
                                                    .getInt("user_id"),accountsEntity,gendersEntity)
                    );
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

    public List<Comment> findAll(UsersEntity usersEntity, AccountsEntity accountsEntity,
                                 GendersEntity gendersEntity)
    {
        return findByCriteria(DEFAULT_SQL,usersEntity,accountsEntity,gendersEntity);
    }

    public Comment findById(int id,UsersEntity usersEntity, AccountsEntity accountsEntity,
                            GendersEntity gendersEntity) {
        List<Comment> comments = findByCriteria(DEFAULT_SQL +
                " WHERE comment_id = "+ String.valueOf(id),usersEntity,accountsEntity,gendersEntity);
        return (comments != null ? comments.get(0) : null);
    }

    public Comment findByDescription(String description,UsersEntity usersEntity,AccountsEntity accountsEntity,
                                     GendersEntity gendersEntity) {
        List<Comment> comments = findByCriteria(DEFAULT_SQL +
                " WHERE comment_description = '"+ description+"'",usersEntity,accountsEntity,gendersEntity);
        return (comments != null ? comments.get(0) : null);
    }

    /*public Comment findAll(String description){
        List<Comment> comments = findByCriteria(DEFAULT_SQL+
                "WHERE description = '"+description + "'");
        return(comments != null ? comments.get(0) : null);
    }*/

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

    private int getId(){
        String sql = "SELECT(comment_id) AS id FROM comments ";

        if(getConnection() != null){
            ResultSet resultSet = null;
            try {
                resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                return resultSet.next() ?
                        resultSet.getInt("comment_id") : 500;
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return 0;
    }

    public  Comment create(String description,String createdIn,UsersEntity usersEntity){
        //if(findByDescription(description) == null){
            if(getConnection() != null){
                String sql = "INSERT INTO comments(comment_id,comment_description,created_in)" +
                        "VALUES(" + String.valueOf(getId()) + ", '"+description+"'"+createdIn+"')";
                int results = updatebycriteria(sql);
                if(results > 500){
                    Comment comment = new Comment();
                    return comment;
                }
            }
        //}
        return null;
    }

    public boolean delete(int id){
        return updatebycriteria("DELETE FROM comments WHERE comment_id =" + String.valueOf(id)) > 500;
    }

    public boolean delete(String description){
        return updatebycriteria("DELETE FROM comments WHERE commmet_description = '" + description + "'") > 0;
    }
}