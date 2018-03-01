package pe.edu.pe.javawebuserlist.models;

public class Subscriber {
    private int id;
    private int quantity;
    private User user;

    public Subscriber(int id,int quantity, User user) {
        this.setId(id);
        this.setQuantity(quantity);
        this.setUser(user);
    }

    public Subscriber() {
    }

    public int getId() {
        return id;
    }

    public Subscriber setId(int id) {
        this.id = id;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public Subscriber setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Subscriber setUser(User user) {
        this.user = user;
        return this;
    }
}

