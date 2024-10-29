package Nachhilfe.Mitarbeiterverwaltung;

public class Geschaeftsfuehrer extends Manager {

    private double zulage;

    public Geschaeftsfuehrer(String name, double festgehalt, double provision,double zulage) {
        super(name, festgehalt, provision);
        this.zulage=zulage;
    }
    @Override
    public double  berechneGehalt(){
        return super.berechneGehalt()+zulage;
    }
}
