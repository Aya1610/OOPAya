package Nachhilfe.Mannschaften;

public class Spieler extends Mitglieder{

    private String Position;
    private int Spieleinsätze;
    private static final double BASIS_GEHALT = 180000.0;
    private static final double BONUS = 5000.0;
    public Spieler(String Vorname, String Nachname,String Position,int Spieleinsätze) {
        super(Vorname, Nachname);
        this.Position=Position;
        this.Spieleinsätze=Spieleinsätze;
    }
    public String getPosition(){
        return Position;

    }
    public int getSpieleinsätze(){
        return Spieleinsätze;

    }
    @Override
    public double berechneGehalt(){
        return BASIS_GEHALT+(Spieleinsätze*BONUS);
    }
}
