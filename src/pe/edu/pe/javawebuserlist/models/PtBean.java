package pe.edu.pe.javawebuserlist.models;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class PtBean implements Serializable{
    private PtService service;
    private User user;

    public PtBean(){
        service = new PtService();
    }
    public List<User> getUsers(){
        return service.findAllUsers();
    }
    public User getUser(){
        return user;
    }
    public void setUser(User user){
        this.user = user;
    }
    public String getNickname(){
        return this.getUser().getNickname();
    }

    public void setNickname(String nickname){
        this.getUser().setNickname(nickname);
    }
    public String newUser(){
        this.setUser(new User());
        return "success";
    }
    public String createUser(){
        this.setUser(new User(this.getUsers()));
        return "success";
    }
    public String editUser(){
        this.setUser(user);
        return "success";
    }
    public String updateUser(){
        service.updateUser(this.getUser());
        return "seccesss";
    }
}

