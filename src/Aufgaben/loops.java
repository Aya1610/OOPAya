package Aufgaben;

import com.sun.source.tree.BreakTree;


public class loops {

    public static void main(String[] args) {
        //1)
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }
        //2)
        int i1 = 1;
        while (i1 < 99) {
            i1 = i1 + 2;
            System.out.println("Ungeraden Zahlen: " + i1);

        }

        //3)
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println();
        System.out.println(sum);


        //4)
        int fakul = 1;
        for (int i = 1; i < 6; i++) {
            fakul = i * fakul;
        }
        System.out.println(fakul);
        System.out.println();


        //5) falsch
        int n = 1234;
        int c = 0;
        for (int i = n - 1; i < n; i--) {
            c = i + c;
        }
        System.out.println(c);
        System.out.println();


        //6)

        //7) falsch
        int t = 10;
        int count = 1;
        for (int i = 0; i < t; i++) {
            count = t + count;

        }
        System.out.println(count);

        //8)
        int zahl =12;
        int p=0;
        for (int i = 1; i <= 10; i++) {
            p = zahl * i;
            System.out.println(p);
            System.out.println();

            //9)

            int su=0;
            int i3=123;
            while (i3>0){
                su=su+i3%10;
                i3=i3/10;
            }
            System.out.println(su);
            System.out.println();

            //10)


        }
    }
}
