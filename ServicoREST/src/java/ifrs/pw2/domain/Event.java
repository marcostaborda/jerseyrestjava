/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifrs.pw2.domain;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marcos
 */
@XmlRootElement
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String img;
    private String url;
    private String sobre;

    public Event(int id, String name, String img, String url, String sobre) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.url = url;
        this.sobre = sobre;
    }
    

    public Event(String name, String img, String url) {
        this.name = name;
        this.img = img;
        this.url = url;
    }

    public Event(int id, String name, String img, String url) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.url = url;
    }

    public Event() {
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }
    @Override
    public String toString() {
        return "Event{" + "id=" + id + ", name=" + name + ", img=" + img + ", url=" + url + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Event event = (Event) o;

        return id == event.id;

    }

    @Override
    public int hashCode() {
        return id;
    }

}
