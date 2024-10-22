package Aufgaben;

import java.util.Scanner;

public class Geldanlage {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Laufzeit");
        int laufzeit=scanner.nextInt();


        System.out.println("Anlagebetrag ");
        double anlagebetrag= scanner.nextDouble();

        System.out.println("1. 1,5 % Verzinsung ohne Bonuszahlung");
        System.out.println("2. 0,7 % Verzinsung mit 15 Euro Bonuszahlung");
        System.out.println("3. 0,4 % Verzinsung mit 20 Euro Bonuszahlung");
        System.out.println("4. 0,1 % Verzinsung mit 50 Euro Bonuszahlung");
        System.out.println("5. Fertig");

        int Auswahl= scanner.nextInt();
        if (Auswahl < 1|| Auswahl > 5){
            System.out.println("Bitte wählen Sie eine der Möglichkeiten 1-5 aus");
        }
        if (Auswahl==5){
            System.out.println("Fertig");
        }
        double Zinssatz = 0;
        double Bonus=0;
        switch (Auswahl){
            case 1:
                Zinssatz=1.5;
                Bonus=0;
                break;
            case 2:
                Zinssatz=0.7;
                Bonus=15;
                break;
            case 3:
                Zinssatz=0.4;
                Bonus=20;
                break;
            case 4:
                Zinssatz=0.1;
                Bonus=50;
                break;
            default:
                System.out.println("Bitte wählen Sie einer der Möglichkeiten 1-5 aua.");
        }
        double Kapitel=berechenKapitel (Zinssatz,Bonus,anlagebetrag,laufzeit);
        System.out.println(laufzeit+" "+Kapitel);


    }
    public static double berechenKapitel(double Zinsatz, double Bonus, double anlagebetrag,int laufzeit){
        double Kapitel=anlagebetrag;
        for (int i = 0; i <laufzeit ; i++) {
            Kapitel=Kapitel*(1+Zinsatz/100)+Bonus;

        }
        return Kapitel;
    }




}
