package pe.edu.pe.javawebuserlist.models;

public class Place {
    private int id;
    private String name;

    public Place(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Place() {
    }

    public int getId() {
        return id;
    }

    public Place setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Place setName(String name) {
        this.name = name;
        return this;
    }
}


