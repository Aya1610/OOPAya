package Nachhilfe.Mitarbeiterverwaltung;

public class Angestellter extends Mitarbeiter {

    private double grundgehalt;
    private double ortszuschlag;
    private double zulage;
    public Angestellter(String name, double grundgehalt,double ortszuschlag,double zulage){
        super(name);
        this.grundgehalt=grundgehalt;
        this.ortszuschlag=ortszuschlag;
        this.zulage=zulage;

    }

    @Override
    public double berechneGehalt() {
        return grundgehalt+ortszuschlag+zulage;
    }
}
