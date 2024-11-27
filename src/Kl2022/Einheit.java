package Kl2022;

public enum Einheit {
    MUM(0.001),
    MM(1),
    CM(10),
    DM(100),
    M(1000),
    KM(1000000);
    private double geeigneteEinheit;

    Einheit(double geeigneteEinheit) {
        this.geeigneteEinheit=geeigneteEinheit;

    }
    public Einheit getGeeigneteEinheit(long laenge) {
        Einheit geeigneteEinheit = this;
        for (Einheit geeignete : Einheit.values()) {
            if (geeignete.geeigneteEinheit <= laenge) {
                geeigneteEinheit = geeignete;
            }
        }
        System.out.println("Die geeignete Einheit für die Länge"+laenge+ "ist: "+geeigneteEinheit);
        return geeigneteEinheit;

    }
}
