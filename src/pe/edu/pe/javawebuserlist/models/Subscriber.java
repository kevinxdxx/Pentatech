package pe.edu.pe.javawebuserlist.models;

public class Subscriber {
    private String id;

    public Subscriber(String id) {
        this.setId(id);
    }

    public Subscriber() {
    }

    public String getId() {
        return id;
    }

    public Subscriber setId(String id) {
        this.id = id;
        return this;
    }
}

