/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifrs.pw2.domain;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author marcos
 */
public class EventService {

    private final List<Event> db = new LinkedList<>();
    
    public EventService(String url) {
        db.add(new Event(1, "Mostra POA", url + "/image/chimacode.png", "http://mostra.poa.ifrs.edu.br/2017/index.html"));
        db.add(new Event(2, "ChimaCode", url +  "/image/mostrapoa.PNG", "http://chimacode.xyz/"));
    }
    public List<Event> getEvents(){
        return db;
    }
}
