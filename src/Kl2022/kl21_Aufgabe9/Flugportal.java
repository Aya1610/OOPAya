package Kl2022.kl21_Aufgabe9;

import java.util.ArrayList;
import java.util.List;
public class Flugportal {
    private List<Flug> flüge;
    private Protokollierer protokollierer;
    public Flugportal() {
        this.flüge = new ArrayList<>();
    }
    public void setFilter(Protokollierer protokollierer) {
        this.protokollierer = protokollierer;
    }
    public void addFlug(Flug flug) {
        flüge.add(flug);
    }
    public List<Flug> sucheDirektfluege(String start, String ziel) {
        List<Flug> verbindungen = new ArrayList<>();
        for (Flug flug : flüge) {
            if (protokollierer.filter(start, ziel, flug.IstDirektflug)) {
                verbindungen.add(flug);
            }
        }
        return verbindungen;
    }
}