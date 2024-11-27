package Nachhilfe.Aufgabe2;

public class Raum extends Raumverwaltung {
    private char trakt;
    private char etage;
    private String nummer;
    private Professor nutzer;

    public Raum(int RaumAnzahlmax, char trakt,char etage, String nummer){
        super(RaumAnzahlmax);
        this.trakt=trakt;
        this.etage=etage;
        this.nummer=nummer;

    }

    public char getTrakt(){
        return trakt;
    }
    public char getEtage(){
        return etage;
    }
    public String getNummer(){
        return nummer;
    }
    public Professor getNutzer(){
        return nutzer;
    }
    public void setNutzer(Professor prof){
        this.nutzer=prof;


    }
    @Override
    public void ausgabeRaumliste() {
        System.out.println("Raum: "+trakt+"."+etage+"."+nummer);


    }
    public void removeNutzer(){
        this.nutzer=null;
    }

    
}
