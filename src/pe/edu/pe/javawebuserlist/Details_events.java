package pe.edu.pe.javawebuserlist;

import org.apache.tools.ant.types.resources.comparators.Date;

public class Details_events {
        private int id;
        private Date date;
        private String commentary;

    public Details_events(int id, Date date, String commentary) {
        this.id = id;
        this.date = date;
        this.commentary = commentary;
    }

    public int getId() {
        return id;
    }

    public Details_events setId(int id) {
        this.id = id;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Details_events setDate(Date date) {
        this.date = date;
        return this;
    }

    public java.lang.String getCommentary() {
        return commentary;
    }

    public Details_events setCommentary(java.lang.String commentary) {
        this.commentary = commentary;
        return this;
    }
}
