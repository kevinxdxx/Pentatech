package pe.edu.pe.javawebuserlist.models;

public class Finalist {
    private int id;
    private Subscriber subscriber;
    private Event event;

    public Finalist(int id, Subscriber subscriber, Event event) {
        this.id = id;
        this.setSubscriber(subscriber);
        this.setEvent(event);

    }
/*
    public Finalist() {
    }

    public String getId() {
        return id;
    }*/

    public Subscriber getSubscriber() {
        return subscriber;
    }

    public Finalist setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
        return this;
    }

    public Event getEvent() {
        return event;
    }

    public Finalist setEvent(Event event) {
        this.event = event;
        return this;
    }

    public Finalist setId(int id) {
        this.id = id;
        return this;
    }
}