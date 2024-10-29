package Nachhilfe.Aufgabe2;

public class RaumTest {


    public static class RaumverwaltungTest extends Raumverwaltung {

        public RaumverwaltungTest(int maxRaumAnzahl) {
            super(maxRaumAnzahl);
        }

        public static void main(String[] args) {
            RaumverwaltungTest verwaltung = new RaumverwaltungTest(5); // Maximal 5 Räume

            // Professoren erstellen
            Professor prof1 = new Professor(5, 'A', '2', "02", "Konstantin Koll");
            Professor prof2 = new Professor(5, 'A', '2', "03", "Michael Stark");

            // Räume erstellen und den Professoren zuweisen
            Raum raum1 = new Raum(5, 'C', '2', "30");
            Raum raum2 = new Raum(5, 'C', '2', "40");
            Raum raum3 = new Raum(5, 'C', '2', "41: Michael Stark");
            Raum raum4= new Raum(5, 'A', '2', "02");
            Raum raum5= new Raum(5, 'A', '2', "03");

            raum1.setNutzer(prof1);
            raum2.setNutzer(prof2);
            raum3.setNutzer(prof1);
            raum4.setNutzer(prof2);


            verwaltung.addRaum(raum1);
            verwaltung.addRaum(raum2);

            verwaltung.ausgabeRaumliste();
        }

        @Override
        public void ausgabeRaumliste() {
            System.out.println("Raumliste:");
            for (int i = 0; i < raumAnzahl; i++) {
                if (raeume[i] != null) {
                    raeume[i].ausgabeRaumliste();
                }
            }
        }
    }
}
