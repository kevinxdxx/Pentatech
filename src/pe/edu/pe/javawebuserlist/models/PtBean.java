package pe.edu.pe.javawebuserlist.models;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class PtBean implements Serializable{
    private PtService service;
    private User user;

}
