package Kl2022.kl21_Aufgabe9;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        String start = "Berlin";
        String ziel = "München";
        Wunschziel wunschziel = new Wunschziel(start, ziel, true);
        //TODO
        // PriseFilter priseFilter = new PriseFilter(200.0, 300.0);
         PriseAndDWünschziel priseAndDWünschziel = new PriseAndDWünschziel(200.0, 300.0, start, ziel);
        Flugportal flugportal = new Flugportal();
        flugportal.setFilter(wunschziel);
        flugportal.addFlug(new Flug("Berlin", "Hamburg", 150.0, false, "127", "Lufthansa"));
        flugportal.addFlug(new Flug("München", "Frankfurt", 350.0, false, "128", "Air France"));
        flugportal.addFlug(new Flug("Stuttgart", "Köln", 250.0, true, "129", "Lufthansa"));
        flugportal.addFlug(new Flug("Hamburg", "Berlin", 180.0, false, "130", "Fly Emirates"));
        flugportal.addFlug(new Flug("Berlin", "Köln", 220.0, true, "131", "Lufthansa"));
        flugportal.addFlug(new Flug("München", "Stuttgart", 320.0, false, "132", "Qatar Airways"));
        flugportal.addFlug(new Flug("Frankfurt", "Berlin", 400.0, true, "133", "British Airways"));
        flugportal.addFlug(new Flug("Berlin", "Frankfurt", 170.0, false, "134", "Air France"));
        flugportal.addFlug(new Flug("Köln", "München", 290.0, true, "135", "Lufthansa"));
        flugportal.addFlug(new Flug("Stuttgart", "Hamburg", 310.0, false, "136", "Fly Emirates"));
        flugportal.addFlug(new Flug("Hamburg", "Köln", 200.0, false, "137", "Qatar Airways"));
        flugportal.addFlug(new Flug("Berlin", "Düsseldorf", 330.0, true, "138", "British Airways"));
        flugportal.addFlug(new Flug("Frankfurt", "Stuttgart", 280.0, false, "139", "Fly Emirates"));
        flugportal.addFlug(new Flug("Köln", "Frankfurt", 260.0, true, "140", "Air France"));
        flugportal.addFlug(new Flug("Hamburg", "Düsseldorf", 190.0, false, "141", "Lufthansa"));
        //TODO
        // Alle Flüge müsse nach preis aufsteigend sortiert werden
        List<Flug> fluege = flugportal.sucheDirektfluege("Berlin", "München");
        // Sortieren nach Preis
        Collections.sort(fluege, Comparator.comparingDouble(f -> f.price));

        if (fluege.isEmpty()) {
            System.out.println("Keine Flüge gefunden von " + start + " nach " + ziel);
        } else {
            for (Flug f : fluege) {
                System.out.println(f);
            }
        }

    }
}