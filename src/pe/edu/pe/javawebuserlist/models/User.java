package pe.edu.pe.javawebuserlist.models;

public class User {
    private int id;
    private String nickname;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private int phone;
    private String description;
    private Account account;
    private Gender gender;

    public User() {
    }
    public User(int maxId, String nickname, String password, String firstName, String lastName, String email, int phone, String description, AccountsEntity accountsEntity, GendersEntity gendersEntity) {
    }
    public User(int user_id, String user_nickname, String user_password, String user_firstname, String user_lastname, String user_email, int user_phone, String user_description, Account accounts_id, Gender gender_id) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.description = description;
        this.setAccount(getAccount());
        this.setGender(getGender());
    }

    public int getId() {
        return id;
    }

    public User setId(int id) {
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

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /*public int getAge() {
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
    }*/

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

    public Account getAccount() {
        return account;
    }

    public User setAccount(Account account) {
        this.account = account;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public User setGender(Gender gender) {
        this.gender = gender;
        return this;
    }
}