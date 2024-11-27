package Nachhilfe.Mitarbeiterverwaltung;

public class Manager extends Mitarbeiter {

    private double festgehalt;
    private double provision;
    private double umsatz;
    public Manager(String name,double festgehalt,double provision) {
        super(name);
        this.festgehalt=festgehalt;
        this.provision=provision;
//        this.umsatz=umsatz;
    }
    public void setUmsatz(double umsatz){
        this.umsatz=umsatz;
    }

    @Override
    public double berechneGehalt() {
        return festgehalt+(provision*umsatz);
    }
}
