package org.example.DB;

public interface DataBaseConnector {

    public String create(String[] playload);
    public String read(String[] playload);
    public String updare(String[] playload);
    public String delete(int playload);


}
