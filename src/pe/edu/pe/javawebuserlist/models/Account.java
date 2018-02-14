package pe.edu.pe.javawebuserlist.models;

public class Account {
    private String id;
    private String type;

    public Account() {
        this.id = id;
        this.type = type;
    }

    public Account(int maxId, String type) {

    }

    public String getId() {
        return id;
    }

    public Account setId(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public Account setType(String type) {
        this.type = type;
        return this;
    }
}
