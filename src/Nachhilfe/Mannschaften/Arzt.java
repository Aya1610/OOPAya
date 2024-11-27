package Nachhilfe.Mannschaften;

public class Arzt extends Mitglieder{

    private String Fachrichtung;
    private static final double Gehalt=100000.0;
    public Arzt(String Vorname, String Nachname, String Fachrichtung){
        super(Vorname,Nachname);
    }
    public String getFachrichtung(){
        return Fachrichtung;
    }

    @Override
    public double berechneGehalt() {
        return Gehalt;
    }
}
