package pe.edu.pe.javawebuserlist.models;

public class Place {
    private String id;
    private String name;

    public Place(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public Place setId(String id) {
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

}
