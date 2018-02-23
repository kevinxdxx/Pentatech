package pe.edu.pe.javawebuserlist.models;

import java.util.List;

public class User {
    private String id;
    private String nickname;
    private String password;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String email;
    private int phone;
    private String description;



    public User() {
    }
    public User(String id, String nickname, String password, String firstName, String lastName, int age, String address, String email, int phone, String description) {
        this.setId(id);
        this.setNickname(nickname);
        this.setPassword(password);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setAddress(address);
        this.setEmail(email);
        this.setPhone(phone);
        this.setDescription(description);
    }

    public User(String id, String firstName) {

    }

    public User(List<User> users) {
    }


    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public User setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String fisrtName) {
        this.firstName = fisrtName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getPhone() {
        return phone;
    }

    public User setPhone(int phone) {
        this.phone = phone;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public User  setDescription(String description) {
        this.description = description;
        return this;
    }
}