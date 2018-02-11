package pe.edu.pe.javawebuserlist.models;

public class Finalist {
    private String id;

    public Finalist(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Finalist setId(String id) {
        this.id = id;
        return this;
    }
}