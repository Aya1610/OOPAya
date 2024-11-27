package Kl2022.kl21_Aufgabe9;


public class PriseAndDWünschziel implements Protokollierer {
    private double minPreis;
    private double maxPreis;
    private String start;
    private String ziel;

    private boolean direktflug;

    public PriseAndDWünschziel(double minPreis, double maxPreis, String start, String ziel) {
        this.minPreis = minPreis;
        this.maxPreis = maxPreis;
        this.start = start;
        this.ziel = ziel;
    }

    @Override
    public boolean filter(String start, String ziel, boolean direktflug) {
        return this.start.equals(start) && this.ziel.equals(ziel) && direktflug == this.direktflug;
    }

    public boolean filterWithPrice(Flug flug) {
        return flug.price >= minPreis && flug.price <= maxPreis;
    }
}
