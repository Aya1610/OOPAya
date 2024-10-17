package Aufgaben;

public class BruchTest {
    public static void main(String[] args) {



    Bruch b = new Bruch(2, 3);
    Bruch b2 = new Bruch(4, 5);
        System.out.println(b);
        System.out.println(b2);
        Bruch kehrwert1= b.kehrwert();
        System.out.println(kehrwert1);

        Bruch add= b.addieren(b2);
        System.out.println(add);

        Bruch multi= b.multiplizieren(b2);



}}