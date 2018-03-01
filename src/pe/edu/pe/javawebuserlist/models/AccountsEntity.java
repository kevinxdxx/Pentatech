package pe.edu.pe.javawebuserlist.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountsEntity extends BaseEntity{
    private static String DEFAULT_SQL = "SELECT * FROM pt.accounts";

    private List<Account> findByCriteria(String sql){
        List<Account> accounts;
        if(getConnection() !=null) {
            accounts = new ArrayList<>();
            try {
                ResultSet resultSet = getConnection().createStatement().executeQuery(sql);

                while (resultSet.next()) {
                    Account account = new Account().setId(resultSet.getInt("account_id"))
                            .setName(resultSet.getString("account_name"))
                            .setType(resultSet.getString("account_type"));
                }
                return accounts;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Account findByNameType(String name, String type){
        List<Account> accounts= findByCriteria(DEFAULT_SQL+
                "WHERE account_name='"+name+"'AND account_type= '"+type+"'");
        return (accounts != null ? accounts.get(0) : null);
    }

    public Account findById(int id){
        List<Account> accounts = findByCriteria(DEFAULT_SQL + "WHERE account_id=" + String.valueOf(id));
        return (accounts !=null ? accounts.get(0) : null);
    }

    /*public Account findByType(String type){
        List<Account> accounts = findByCriteria(DEFAULT_SQL + "WHERE account_type = ' " + type + "'");
        return (accounts != null ? accounts.get(0):null);
    }*/


    /*private int getMaxId() {
        String sql = "SELECT MAX(account_id) AS max_id FROM accounts";
        if (getConnection() != null) {
            try {
                ResultSet resultSet = getConnection().createStatement().executeQuery(sql);
                return resultSet.next() ?
                        resultSet.getInt("max_id") : 0;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    private int updateByCriteria(String sql) {
        if (getConnection() != null) {
            try {
                return getConnection()
                        .createStatement()
                        .executeUpdate(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }*/



    public Account create(Account account){
        if (getConnection() != null) {
            try {
                String sql = "INSERT INTO accounts(account_id,account_name,account_type,)"
                        +"VALUES('"+account.getId()+"','"+ account.getName()+"','"+account.getType()+"')";
                getConnection().createStatement().execute(sql);
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
