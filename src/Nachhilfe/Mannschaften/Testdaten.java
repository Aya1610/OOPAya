package Nachhilfe.Mannschaften;

public class Testdaten {
    public static void main(String[] args) {


       Spieler spieler1 = new Spieler("Götze", "Mario", "Mittelfeld", 5);
       Spieler spieler2 = new Spieler("Aubameyang", "Pierre-Emerik", "Stürmer", 18);
       Trainer trainer = new Trainer("Tuchel", "Thomas", "Aubameyang");
       Arzt arzt = new Arzt("Braun", "Markus", "Orthopädie");
       //**
       Mannschaft mannschaft=new Mannschaft("BVB");

       System.out.println("Name: " + spieler1.getNachname() + " " + spieler1.getVorname());
       System.out.println("Typ: Spieler");
       System.out.println("Position: " + spieler1.getPosition());
       System.out.println("Spieleinsatz: " + spieler1.getSpieleinsätze());
       System.out.println("Gehalt: " + spieler1.berechneGehalt() + " EUR\n");


       System.out.println("Name: " + spieler2.getNachname() + " " + spieler2.getVorname());
       System.out.println("Typ: Spieler");
       System.out.println("Position: " + spieler2.getPosition());
       System.out.println("Spieleinsatz: " + spieler2.getSpieleinsätze());
       System.out.println("Gehalt: " + spieler2.berechneGehalt() + " EUR\n");

       // Ausgabe der Informationen für den Trainer
       System.out.println("Name: " + trainer.getNachname() + " " + trainer.getVorname());
       System.out.println("Typ: Trainer");
       System.out.println("Lieblingsspieler: " + trainer.getlieblingsSpieler());
       System.out.println("Gehalt: " + trainer.berechneGehalt() + " EUR\n");

       // Ausgabe der Informationen für den Arzt
       System.out.println("Name: " + arzt.getNachname() + " " + arzt.getVorname());
       System.out.println("Typ: Arzt");
       System.out.println("Fachrichtung: " + arzt.getFachrichtung());
       System.out.println("Gehalt: " + arzt.berechneGehalt() + " EUR\n");



       // mannschaft.addMitglied(new Spieler("Götze", "Mario", "Mittelfeld", 5));
    }
}



