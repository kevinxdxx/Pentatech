package pe.edu.pe.javawebuserlist;

public class User {
    private int id;
    private String nickname;
    private String password;
    private String type;

    public User(int id, String nickname, String password, String type) {
        this.setId(id);
        this.setNickname(nickname);
        this.setPassword(password);
        this.setType(type);
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

    public String getType() {
        return type;
    }

    public User setType(String type) {
        this.type = type;
        return this;
    }
}
