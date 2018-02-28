package pe.edu.pe.javawebuserlist.models;

public class Account {
    private int id;
    private String name;
    private String type;

    public Account() {
        this.name=name;
        this.id = id;
        this.type = type;
    }



    public int getId() {
        return id;
    }

    public Account setId(int id) {
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

    public String getName() {
        return name;
    }

    public Account setName(String name) {
        this.name = name;
        return this;
    }
}
