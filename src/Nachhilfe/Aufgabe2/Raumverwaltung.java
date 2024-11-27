package Nachhilfe.Aufgabe2;

public abstract class Raumverwaltung {

    protected Raum[] raeume;
    protected int raumAnzahl=0;



    public Raumverwaltung(int RaumAnzahlmax){
        raeume= new Raum[RaumAnzahlmax];


    }
    public void addRaum(Raum raum){
        if (raumAnzahl< raeume.length) {
            raeume[raumAnzahl] = raum;
            raumAnzahl++;
        }else {
            System.out.println("Fertig!");
        }

    }



    public abstract void ausgabeRaumliste();

    }


