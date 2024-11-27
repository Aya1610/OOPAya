package Nachhilfe.Aufgabe2;

public class Professor extends Raum {
    private String name;


    public Professor(int RaumAnzahlmax, char trakt,char etage, String nummer,String name){
        super(RaumAnzahlmax,trakt,etage,nummer);
        this.name=name;

    }
    public String getNamme(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }



    @Override
    public void ausgabeRaumliste(){
        super.ausgabeRaumliste();



    }
}
