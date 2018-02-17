package pe.edu.pe.javawebuserlist.models;

public class Comment {
    private String id;
    private String description;
    private String CreatedIn;

    public Comment(String id, String description, String createdIn) {
        this.id = id;
        this.description = description;
        CreatedIn = createdIn;
    }

    public Comment() {
    }

    public String getId() {
        return id;
    }

    public Comment setId(String id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Comment setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCreatedIn() {
        return CreatedIn;
    }

    public Comment setCreatedIn(String createdIn) {
        CreatedIn = createdIn;
        return this;
    }
}
