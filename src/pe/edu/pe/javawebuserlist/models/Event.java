package pe.edu.pe.javawebuserlist.models;

public class Event {
    private String id;
    private String date;
    private int capacity;

    public Event(String id, String date, int capacity) {
        this.id = id;
        this.date = date;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public Event setId(String id) {
        this.id = id;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Event setDate(String date) {
        this.date = date;
        return this;
    }

    public int getCapacity() {
        return capacity;
    }

    public Event setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }
}
