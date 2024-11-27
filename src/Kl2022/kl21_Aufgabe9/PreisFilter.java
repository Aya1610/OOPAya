package Kl2022.kl21_Aufgabe9;



class PriseFilter implements Protokollierer {
    private double minPreis;
    private double maxPreis;

    public PriseFilter(double minPreis, double maxPreis) {
        this.minPreis = minPreis;
        this.maxPreis = maxPreis;
    }

    @Override
    public boolean filter(String start, String ziel, boolean direktflug) {
        return false;
    }

    public boolean filterByPrice(Flug flug) {
        return flug.price >= minPreis && flug.price <= maxPreis;
    }
}

