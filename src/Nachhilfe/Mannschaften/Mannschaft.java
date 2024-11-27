package Nachhilfe.Mannschaften;

import Nachhilfe.Mitarbeiterverwaltung.Mitarbeiter;

public class Mannschaft {
    private String name;
    private Mitarbeiter[] mitglieder;

    public Mannschaft(String name) {
        this.name = name;
        this.mitglieder = new Mitarbeiter[30];
    }
    public void addMitglied(Mitarbeiter mitglied) {
        if (mitglieder.length < 30) {
            mitglieder[mitglieder.length - 1] = mitglied;
        }
    }
}
