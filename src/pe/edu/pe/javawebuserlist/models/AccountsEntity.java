package pe.edu.pe.javawebuserlist.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountsEntity extends BaseEntity{
    private static String DEFAULT_SQL = "SELECT + FROM pt_mysql.accounts";

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

}
