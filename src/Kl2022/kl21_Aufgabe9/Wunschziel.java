package Kl2022.kl21_Aufgabe9;

    public class Wunschziel implements Protokollierer {
        private String start;
        private String ziel;
        private boolean direktflug;
        public Wunschziel(String start, String ziel, boolean direktflug) {
            this.start = start;
            this.ziel = ziel;
            this.direktflug = direktflug;
        }
        @Override
        public boolean filter(String start, String ziel, boolean direktflug) {
            if (this.start.equals(start) && this.ziel.equals(ziel) && this.direktflug == direktflug) {
                return true;
            }else{
                return false;
            }
        }
    }

