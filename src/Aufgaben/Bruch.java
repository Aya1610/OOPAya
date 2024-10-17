package Aufgaben;

public class Bruch {
    private int zaehler;
    private int nenner;

    public Bruch(){
        this.zaehler=1;
        this.nenner=1;
    }
    public Bruch(int zaehler, int nenner){
        this.zaehler=zaehler;
        this.nenner=nenner;
    }
    public int getZaehler(){
        return zaehler;
    }
    public int getNenner() {
        return nenner;
    }
    public Bruch kehrwert(){
    return new Bruch(nenner,zaehler);
    }
    public Bruch addieren( Bruch b) {
        int neuZ = this.zaehler * b.getNenner()+
                b.getZaehler() * this.nenner;
        int neuN= this.nenner*b.getNenner();
        return  new Bruch(neuZ,neuN);
    }
    public Bruch multiplizieren(Bruch b){
        int neueZ=this.zaehler*b.getZaehler();
        int neueN=this.nenner*b.getNenner();
        return new Bruch(neueZ,neueN);
    }
    public String toString() {
        {
            return zaehler + "/" + nenner;

        }

    }
}
