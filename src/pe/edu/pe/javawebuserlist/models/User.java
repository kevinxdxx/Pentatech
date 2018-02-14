package pe.edu.pe.javawebuserlist.models;

public class User {
    private String id;
    private String nickname;
    private String password;
    private String fisrtName;
    private String lastName;
    private int age;
    private String adrress;
    private String email;
    private int phone;



    public User() {
    }
    public User(String id, String nickname, String password, String fisrtName, String lastName, int age, String adrress, String email, int phone) {
        this.setId(id);
        this.setNickname(nickname);
        this.setPassword(password);
        this.setFisrtName(fisrtName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setAdrress(adrress);
        this.setEmail(email);
        this.setPhone(phone);
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

    public String getFisrtName() {
        return fisrtName;
    }

    public User setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
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

    public String getAdrress() {
        return adrress;
    }

    public User setAdrress(String adrress) {
        this.adrress = adrress;
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
}