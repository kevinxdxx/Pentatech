package pe.edu.pe.javawebuserlist.models;

public class Event {
    private int id;
    private String date;
    private int capacity;
    private Gender gender;
    private Place place;
    private Mediacontent mediacontent;
    private Comment comment;

    public Event(int event_id, String event_date, Gender accounts_id, Place gender_id, Mediacontent mediacontent_id, Comment comment_id) {
    }

    public Event(int id, String date, int capacity) {
        this.id = id;
        this.date = date;
        this.capacity = capacity;
        this.setGender(gender);
        this.setPlace(place);
        this.setMediacontent(mediacontent);
        this.setComment(comment);
    }

    public Event() {

    }

    public int getId() {
        return id;
    }

    public Event setId(int id) {
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
    public Gender getGender() {
        return gender;
    }

    public Event setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public Place getPlace() {
        return place;
    }

    public Event setPlace(Place place) {
        this.place = place;
        return this;
    }

    public Mediacontent getMediacontent() {
        return mediacontent;
    }

    public Event setMediacontent(Mediacontent mediacontent) {
        this.mediacontent = mediacontent;
        return this;
    }

    public Comment getComment() {
        return comment;
    }

    public Event setComment(Comment comment) {
        this.comment = comment;return this;
    }
}
