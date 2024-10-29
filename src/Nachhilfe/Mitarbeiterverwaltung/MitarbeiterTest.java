package Nachhilfe.Mitarbeiterverwaltung;

public class MitarbeiterTest {
    public static void main(String[] args) {
        // Manager erstellen
        Manager manager = new Manager("Hans Meier", 5000, 0.1);
        manager.setUmsatz(20000);

        // Geschäftsführer erstellen
        Geschaeftsfuehrer geschaeftsfuehrer = new Geschaeftsfuehrer("Claudia Schulz", 7000, 0.15, 2000);
        geschaeftsfuehrer.setUmsatz(30000);

        // Namen, Personalnummer und Gehalt ausgeben
        System.out.println("Manager:");
        System.out.println("Name: " + manager.getName());
        System.out.println("Personalnummer: " + manager.getPersonalnummer());
        System.out.println("Gehalt: " + manager.berechneGehalt() + " EUR");

        System.out.println("\nGeschaeftsfuehrer:");
        System.out.println("Name: " + geschaeftsfuehrer.getName());
        System.out.println("Personalnummer: " + geschaeftsfuehrer.getPersonalnummer());
        System.out.println("Gehalt: " + geschaeftsfuehrer.berechneGehalt() + " EUR");

    }
}
