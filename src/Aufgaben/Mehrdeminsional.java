package Aufgaben;

import java.awt.*;
import java.util.Arrays;

public class Mehrdeminsional {
        public static void main(String[] args) {
            int zeilen = 5;
            int spalten = 5;
            String[][] array = new String[zeilen][spalten];
            for (int i = 0; i < zeilen; i++) {
                for (int j = 0; j < spalten; j++) {
                    if (j < spalten / 2) {
                        array[i][j] = "L";
                    } else if (j > spalten / 2)
                        array[i][j] = "R";
                    else {
                        array[i][j] = "X";
                    }
                }
                System.out.println();


            }
            for (int i = 0; i < zeilen; i++) {
                for (int j = 0; j < spalten; j++) {
                    System.out.println(array[i][j]);
                }
                System.out.println();
            }
            System.out.println();

        int zeilen2 =7;
        int spalten2=7;
        String[][] array2 = new String[zeilen2][spalten2];
            for (int i = 0; i <zeilen2 ; i++) {
                for (int j = 0; j <spalten2 ; j++) {

                    if (i + j == 3 && i <= 3 || i + j == 9 && i >= 3) {
                        System.out.print ( "B" );
                    } else if (j == i + 3 & j > 3  || i == j + 3 && j < 3) {
                        System.out.print ( "C" );
                    } else {
                        System.out.print (" ");
                    }
                }
                System.out.println ();
            }
            System.out.println ();
            int zeilen3=7;
            int spalten3=9;
            String[][] array3 = new String[zeilen3][spalten3];


            for (int i = 0; i < zeilen2; i++) {
                for (int j = 0; j < spalten2; j++) {
                    if ((i + j == 4 && j <= spalten3 / 2) ||
                            (j - i == 4 && j > spalten3 / 2) ||
                            (i == zeilen3 / 2 && j < spalten3 - i - 1 && j > zeilen3 - i -1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
               String [][]c= {
                {"* ", "1 ", "1", "1", "1", "1", "1", "1", "*"},
                {"4", "*", "1", "1", "1", "1", "1", "*", "2"},
                {"4", "4", "*", "1", "1", "1", "*", "2", "2"},
                {"4", "4", "4", "*", "1", "*", "2", "2", "2"},
                {"4", "4", "4", "4", "*", "2", "2", "2", "2"},
                {"4", "4", "4", "*", "3", "*", "2", "2", "2"},
                {"4", "4", "*", "3", "3", "3", "*", "2", "2"},
                {"4", "*", "3", "3", "3", "3", "3", "*", "2"},
                {"*", "3", "3 ", "3 ", "3 ", "3 ", "3 ", "3 ", "* "}
            };
                for (int j = 0; j < c.length; j++) {
                    System.out.println(Arrays.toString(c[i]));

                }
            }
        }
}

