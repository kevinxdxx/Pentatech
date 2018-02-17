package pe.edu.pe.javawebuserlist.models;

public class Gender {
    private String id;
    private String description;

    public Gender(String id, String description) {
        this.setId(id);
        this.setDescription(description);
    }

    public Gender() {
    }

    public String getId() {
        return id;
    }

    public Gender setId(String id) {
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
