package pe.edu.pe.javawebuserlist;

import com.oracle.wls.shaded.org.apache.xpath.operations.String;

public class Singer {
    private int id;
    private String name;
    private String last_name;
    private String ocupation;
    private int age;
    private String address;
    private String email;
    private int phone;
    private int score;
    private String commentary;

    public Singer(int id, String name, String last_name, String ocupation,
                  int age, String address, String email, int phone,
                  int score, String commentary) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.ocupation = ocupation;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.score = score;
        this.commentary = commentary;
    }

    public int getId() {
        return id;
    }

    public Singer setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Singer setName(String name) {
        this.name = name;
        return this;
    }

    public String getLast_name() {
        return last_name;
    }

    public Singer setLast_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    public String getOcupation() {
        return ocupation;
    }

    public Singer setOcupation(String ocupation) {
        this.ocupation = ocupation;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Singer setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Singer setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Singer setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getPhone() {
        return phone;
    }

    public Singer setPhone(int phone) {
        this.phone = phone;
        return this;
    }

    public int getScore() {
        return score;
    }

    public Singer setScore(int score) {
        this.score = score;
        return this;
    }

    public String getCommentary() {
        return commentary;
    }

    public Singer setCommentary(String commentary) {
        this.commentary = commentary;
        return this;
    }
}
