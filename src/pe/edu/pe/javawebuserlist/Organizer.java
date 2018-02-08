package pe.edu.pe.javawebuserlist;

public class Organizer {
    private int id;
    private String name;
    private String last_name;
    private String ocupation;
    private int age;
    private String address;
    private String email;
    private int phone;

    public Organizer(int id, String name, String last_name, String ocupation, int age, String address, String email, int phone) {
        this.setId(id);
        this.setName(name);
        this.setLast_name(last_name);
        this.setOcupation(ocupation);
        this.setAge(age);
        this.setAddress(address);
        this.setEmail(email);
        this.setPhone(phone);
    }

    public int getId() {
        return id;
    }

    public Organizer setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Organizer setName(String name) {
        this.name = name;
        return this;
    }

    public String getLast_name() {
        return last_name;
    }

    public Organizer setLast_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    public String getOcupation() {
        return ocupation;
    }

    public Organizer setOcupation(String ocupation) {
        this.ocupation = ocupation;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Organizer setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Organizer setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Organizer setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getPhone() {
        return phone;
    }

    public Organizer setPhone(int phone) {
        this.phone = phone;
        return this;
    }
}
