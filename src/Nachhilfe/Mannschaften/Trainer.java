package Nachhilfe.Mannschaften;

public class Trainer extends Mitglieder{

    private String lieblingsSpieler;
    private static final double GEHALT = 165000.0;
    public Trainer(String Vorname, String Nachname,String lieblingsSpieler) {
        super(Vorname, Nachname);
        this.lieblingsSpieler = lieblingsSpieler;
    }
    public String getlieblingsSpieler() {
        return lieblingsSpieler;
    }

    @Override
    public double berechneGehalt() {
        return GEHALT;
    }
}
