package Aufgaben;

public class hoppla {
    public static void hoppla(long x, long y, double z) {
        System.out.println("l1d");
    }

    public static void hoppla(long x, long y, long z) {
        System.out.println("l1l");
    }

    public static void hoppla(double x, long y, double z) {
        System.out.println("d1d");
    }

    public static void hoppla(double x, long y, long z) {
        System.out.println("d1l");
    }

    public static void main(String[] args) {
        long a = 333;
        double b = 4.44;

        // Aufruf 1: gültig
        hoppla(a, a, b);

        // Aufruf 2: ungültig
        // hoppla(b, b, b);

        // Aufruf 3: gültig
        hoppla(b, a, b);

        // Aufruf 4: gültig
        hoppla(b, a, a);
    }
}
