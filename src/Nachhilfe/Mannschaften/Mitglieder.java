package Nachhilfe.Mannschaften;

public abstract class Mitglieder {
    private String Vorname;
    private String Nachname;
    public Mitglieder(String Vorname,String  Nachname){
        this.Vorname=Vorname;
        this.Nachname=Nachname;
    }
    public String getVorname(){
        return Vorname;
    }
    public String getNachname(){
        return Nachname;
    }
    public abstract double berechneGehalt();

}
