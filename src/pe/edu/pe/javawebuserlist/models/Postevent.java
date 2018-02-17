package pe.edu.pe.javawebuserlist.models;

public class Postevent {
    private String id;
    private String dateIni;
    private int quantity;

    public Postevent(String id, String dateIni, int quantity) {
        this.setId(id);
        this.setDateIni(dateIni);
        this.setQuantity(quantity);
    }

    public Postevent() {
    }

    public String getId() {
        return id;
    }

    public Postevent setId(String id) {
        this.id = id;
        return this;
    }

    public String getDateIni() {
        return dateIni;
    }

    public Postevent setDateIni(String dateIni) {
        this.dateIni = dateIni;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public Postevent setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }
}
