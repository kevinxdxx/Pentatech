package pe.edu.pe.javawebuserlist.models;

public class Suscription {
    private String id;

    public Suscription(String id) {
        this.setId(id);
    }

    public Suscription() {
    }

    public String getId() {
        return id;
    }

    public Suscription setId(String id) {
        this.id = id;
        return this;
    }
}

