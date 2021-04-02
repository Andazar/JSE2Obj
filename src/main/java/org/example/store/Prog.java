package org.example.store;

public class Prog<St> {
    private St vers;
    private String descrip;

    public Prog(St vers, String descrip) {
        this.vers = vers;
        this.descrip = descrip;
    }



    public St getVers() {
        return vers;
    }

    public void setVers(St vers) {
        this.vers = vers;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
}
