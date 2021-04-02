package org.example.store;

import java.util.ArrayList;

public class FIFO {
    //private String event = "";
    ArrayList<String> events1 = new ArrayList<String>();

    //public String getEvent() {        return event;    }
    //public void setEvent(String event) {        this.event = event;    }
    public ArrayList<String> getEvents() {        return events1;    }
    public void setEvents(ArrayList<String> events) {        this.events1 = events;    }

    public void addEvent(String event)
    {
        events1.add(event);
    }

    public String prosEvent()
    {
        String e = events1.get(0);
        events1.remove(0);
       return "Обработано событие: " + e + ", под номером 1";
    }

}
