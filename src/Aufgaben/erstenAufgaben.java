package Aufgaben;

public class erstenAufgaben {


    public static void main(String[] args) {
        System.out.println("Hallo");
        // 1)
        int n=10;
        int b=7;
        float f=23.41f;
        System.out.println(n+b);
        System.out.println(n-b);
        System.out.println(n+f);
        System.out.println(n*f);
        System.out.println((int)(f*10%10));




        //2)
        int alter= 23;
        System.out.println(alter>18 && alter<= 30);




        //3)
        System.out.println("Int min: "+Integer.MIN_VALUE);
        System.out.println("Int max"+Integer.MAX_VALUE );
        System.out.println();
        System.out.println("Byte min: " + Byte.MIN_VALUE);
        System.out.println("Byte max: " + Byte.MAX_VALUE);
        System.out.println();
        System.out.println("Short min: " + Short.MIN_VALUE);
        System.out.println("Short max: " + Short.MAX_VALUE);
        System.out.println();
        System.out.println("Long min: " + Long.MIN_VALUE);
        System.out.println("Long max: " + Long.MAX_VALUE);




        //4)
        int n2=4;
        switch (n2) {
            case 1:
                System.out.println("Samstag");
                break;
            case 2:
                System.out.println("Sonntag");
                break;
            case 3:
                System.out.println("Montag");
                break;
            case 4:
                System.out.println("Dienstag");
                break;
            case 5:
                System.out.println("Mittwoch");
                break;
            case 6:
                System.out.println("Donnerstag");
                break;
            case 7:
                System.out.println("Freitag");
                break;
            default:
                System.out.println("Bitte eine Zahl von 1 bis 7 eingeben.");
                break;
        }



        //5)
        int punktezahl= 70;
        char note;
        if (punktezahl>=90){
            note='A';
        }
        else if (punktezahl>=80) {
            note = 'B';
        }
        else if (punktezahl>=70) {
            note = 'C';
        }
        else if (punktezahl>=60){
            note='D';
        }
        else {
            note='F';
        }
        System.out.println("Note: "+note);
        System.out.println();



        //7)
        int i=2;
        int i2=3;
        int i3=4;
        int p;
        if (i>i2 && i>i3) {
          p=i;
        } else if (i2>i && i2>i3){
            p=i2;
        }
        else {
            p=i3;
        }
        System.out.println("Großte Zahl: "+p);
        System.out.println();


        //8)
        int Jahr=2025;
        System.out.println(Jahr%4==0);





        //9)
        String Passwort="1234aya";
        String Passwort2="1234aya";
        String Benutzername="Aya";
        String Benutzername2="Aya";
        if (Benutzername2.equals(Benutzername) && Passwort2.equals(Passwort)) {
            System.out.println("Der login ist erfolgreich");
        } else{
            System.out.println("Falsche Passwort oder Beutzernamme ");

            }
        }

    }




