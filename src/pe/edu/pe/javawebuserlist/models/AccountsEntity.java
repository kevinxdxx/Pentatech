package pe.edu.pe.javawebuserlist.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountsEntity extends BaseEntity{
    private static String DEFAULT_SQL = "SELECT * FROM pt_mysql.accounts";

    private List<Account> findByCriteria(String sql){
        List<Account> accounts;
        if(getConnection() !=null) {
            accounts = new ArrayList<>();
            try {
                ResultSet resultSet = getConnection().createStatement().executeQuery(sql);

                while (resultSet.next()) {
                    Account account = new Account().setId(resultSet.getString("id_accounts"))
                            .setType(resultSet.getString("accounts_type"));
                }
                return accounts;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public List<Account> findAll(){
        return findByCriteria(DEFAULT_SQL);
    }

    public Account findById(String id){
        List<Account> accounts = findByCriteria(DEFAULT_SQL + "WHERE id_accounts=" + String.valueOf(id));
        return (accounts !=null ? accounts.get(0) : null);
    }

    public Account findBytype(String type){
        List<Account> accounts = findByCriteria(DEFAULT_SQL + "WHERE accounts_type = ' " + type + "'");
        return (accounts != null ? accounts.get(0):null);
    }


    private int getMaxId() {
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
    }



    public Account create(String type){
        if (findByCriteria(type) == null){
            if (getConnection() != null){
                String sql = "INSERT INTO accounts(account_id, accounts_type) VALUES(" +
                        String.valueOf(getMaxId() +1 ) +", '" + type + "')";
                int result = updateByCriteria(sql);
                if(result > 0){
                    Account account = new Account(getMaxId(),type);
                    return account  ;
                }
            }
        }
        return null;
    }
}
