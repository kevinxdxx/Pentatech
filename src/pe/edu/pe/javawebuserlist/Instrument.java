package pe.edu.pe.javawebuserlist;

import com.oracle.wls.shaded.org.apache.xpath.operations.String;

public class Instrument {
    private int id;
    private String description;
    private int quantity;
    private String state;

    public Instrument(int id, String description, int quantity, String state) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public Instrument setId(int id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Instrument setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public Instrument setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getState() {
        return state;
    }

    public Instrument setState(String state) {
        this.state = state;
        return this;
    }
}

