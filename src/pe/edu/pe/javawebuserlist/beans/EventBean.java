package pe.edu.pe.javawebuserlist.beans;

import pe.edu.pe.javawebuserlist.models.Event;
import pe.edu.pe.javawebuserlist.models.PtService;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class EventBean implements Serializable {
    private PtService service;
    private Event event;

    public EventBean(){
        service=new PtService();
    }
    public Event getEvent(){
        return event;
    }
    public void setEvent(Event event){
        this.event = event;
    }
    public int getId(){
        return this.getEvent().getId();
    }

    public void setId(int id){
        this.getEvent().setId(id);
    }
    public String getDate(){
        return this.getEvent().getDate();
    }
    public void setDate(String date){
        this.getEvent().setDate(date);
    }
    public String viewEvent(Event event){
        this.setEvent(event);
        return "success";
    }
public String createEvent(){
        this.setEvent(this.getEvent());
        return "success";
}




}
