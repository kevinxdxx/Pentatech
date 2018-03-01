package pe.edu.pe.javawebuserlist.models;

public class Gender {
    private int id;
    private String description;

    public Gender(int id, String description) {
        this.setId(id);
        this.setDescription(description);
    }

    public Gender() {
    }

    public int getId() {
        return id;
    }

    public Gender setId(int id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Gender setDescription(String description) {
        this.description = description;
        return this;
    }
}
