package pe.edu.pe.javawebuserlist;

import com.oracle.wls.shaded.org.apache.xpath.operations.String;

public class Place {
    private int id;
    private String site;
    private String capacity;

    public Place(int id, String site, String capacity) {
        this.setId(id);
        this.setSite(site);
        this.setCapacity(capacity);
    }

    public int getId() {
        return id;
    }

    public Place setId(int id) {
        this.id = id;
        return this;
    }

    public String getSite() {
        return site;
    }

    public Place setSite(String site) {
        this.site = site;
        return this;
    }

    public String getCapacity() {
        return capacity;
    }

    public Place setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }
}
