package pe.edu.pe.javawebuserlist;

import com.sun.xml.ws.config.metro.parser.jsr109.String;

public class Gender {

    private int id;
    private String description;

    public Gender(int id, String description) {
        this.id = id;
        this.description = description;
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
