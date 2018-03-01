package pe.edu.pe.javawebuserlist.beans;

import pe.edu.pe.javawebuserlist.models.Gender;
import pe.edu.pe.javawebuserlist.models.PtService;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class GenderBean implements Serializable{
    private PtService service;
    private Gender gender;

    public GenderBean(){
        service=new PtService();
    }
    
}
