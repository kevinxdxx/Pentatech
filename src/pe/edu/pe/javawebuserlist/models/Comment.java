package pe.edu.pe.javawebuserlist.models;

public class Comment {
    private int id;
    private String description;
    private String CreatedIn;
    private User user;

    public Comment() {
    }

    public Comment(int id, String description, String createdIn, User user) {
        this.id = id;
        this.description = description;
        CreatedIn = createdIn;
        this.setUser(user);
    }

    public int getId() {
        return id;
    }

    public Comment setId(int id) {
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

    public User getUser() {
        return user;
    }

    public Comment setUser(User user) {
        this.user = user;
        return this;
    }
}