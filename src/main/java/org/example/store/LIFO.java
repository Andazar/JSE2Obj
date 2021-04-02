package org.example.store;

import java.util.ArrayList;

public class LIFO {
    //public String event = "";
    ArrayList<String> events2 = new ArrayList<String>();

    //public String getEvent() {        return event;    }
    //public void setEvent(String event) {        this.event = event;    }
    public ArrayList<String> getEvents() {        return events2;    }
    public void setEvents(ArrayList<String> events) {        this.events2 = events;    }

    public void addEvent(String event)
    {
        events2.add(event);
    }

    public String prosEvent()
    {
        String e = events2.get((events2.size()-1));
        int ind = (events2.size()-1);
        events2.remove(ind);
        return "Обработано событие: " + e + ", под номером " + (events2.size());

    }


}
