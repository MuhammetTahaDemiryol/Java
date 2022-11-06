package Kodlama.io.Devs.entities.concretes;

public class ProgrammingLanguage {
    
    private int ID;
    private String NAME;

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(int ID, String NAME) {
        this.ID = ID;
        this.NAME = NAME;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return this.NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
    

}
