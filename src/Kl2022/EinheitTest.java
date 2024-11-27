package Kl2022;


    public class EinheitTest {
        public static void main(String[] args) {
            // Beispiel-Längen
            long laenge1 = 1500; // Test mit 1500 mm
            long laenge2 = 500000; // Test mit 500000 mm
            long laenge3 = 50; // Test mit 50 mm

            // Einheit auswählen basierend auf den Eingaben
            Einheit passendeEinheit1 = Einheit.MM.getGeeigneteEinheit(laenge1);
            Einheit passendeEinheit2 = Einheit.MM.getGeeigneteEinheit(laenge2);
            Einheit passendeEinheit3 = Einheit.MM.getGeeigneteEinheit(laenge3);

            // Ergebnisse anzeigen
            System.out.println("Passende Einheit für Länge " + laenge1 + ": " + passendeEinheit1);
            System.out.println("Passende Einheit für Länge " + laenge2 + ": " + passendeEinheit2);
            System.out.println("Passende Einheit für Länge " + laenge3 + ": " + passendeEinheit3);
        }
    }

