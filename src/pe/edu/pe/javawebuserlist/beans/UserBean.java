package pe.edu.pe.javawebuserlist.beans;

import pe.edu.pe.javawebuserlist.models.PtService;
import pe.edu.pe.javawebuserlist.models.User;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class UserBean implements Serializable{
    private PtService service;
    private User user;

    public UserBean(){
        service = new PtService();
    }
    /*public List<User> getUsers(){
        return service.findAllUsers();
    }*/
    public User getUser(){
        return user;
    }
    public void setUser(User user){
        this.user = user;
    }
///////////////////////////////////////////////////
    public int getId(){
        return this.getUser().getId();
    }

    public void setId(int id){
        this.getUser().setId(id);
    }

    public String getNickname(){
        return this.getUser().getNickname();
    }

    public void setNickname(String nickname){
        this.getUser().setNickname(nickname);
    }

    public String getPassword(){
        return this.getUser().getPassword();
    }

    public void setPassword(String password){
        this.getUser().setPassword(password);
    }

    public String getFirstName(){
        return this.getUser().getFirstName();
    }

    public void setFirstName(String firstName){
        this.getUser().setFirstName(firstName);
    }

    public String getLastName(){
        return this.getUser().getLastName();
    }

    public void setLastName(String lastName){
        this.getUser().setLastName(lastName);
    }

    public String getEmail(){
        return this.getUser().getEmail();
    }

    public void setEmail(String email){
        this.getUser().setEmail(email);
    }

    public int getPhone(){
        return this.getUser().getPhone();
    }

    public void setPhone(int phone){
        this.getUser().setPhone(phone);
    }

    public String getDescription() {
        return this.getUser().getDescription();
    }

    public void setDescription(String description){
        this.getUser().setDescription(description);
    }

    public String newUser(){
        this.setUser(new User());
        return "success";
    }

    public String viewUser(User user){
        this.setUser(user);
        return "success";
    }

    public String createUser(){
        this.setUser(this.getUser());
        return "success";
    }

    /*public String editUser(User user){
        this.setUser(user);
        return "success";
    }*/

    /*public String updateUser(User user){
        service.updateUser(this.getUser());
        return "success";
    }*/

}

