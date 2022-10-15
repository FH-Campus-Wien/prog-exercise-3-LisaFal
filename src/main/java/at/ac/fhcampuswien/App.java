package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static



        public static void oneMonthCalendar(int numberDays, int startingDay){

            int i;
            int day;
            for (i = 1; i <= startingDay-1; i++) {
                System.out.print("   ");
            }
            for (day = 1; day <= numberDays; day++, i++) {
                if (day < 10) {
                    System.out.printf(" ");
                }
                System.out.print(day + " ");

                if (i % 7 == 0 && day <= 29) {
                    System.out.println();
                }

                } System.out.println();
            }





/*public static boolean swapArrays(int[] numbers1, int[] numbers2) {
if(numbers1.length != numbers2.length)
    return false;
    return true;
}*/


    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.

        oneMonthCalendar(28,2);


       /* for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]); //um Argumente in der Main-Methode auszugeben;
        }

        //Test der Methode / Methodenaufruf im Fall von void:
        oneMonthCalendar(31,7);


        //"einfangen des Wertes" Bsp. 4
        //als Bsp: Array inline / Variable als Zwischenspeicher!
        boolean returnValue = swapArrays(new int[]()...)
        //eigentlich:
        int []numbers1 = new int[10]; //Feld der Größe 10 wird erstellt
        numbers1[0] = 44; //Index 0 - Wert 44
        int x = numbers1[9];

        int []numbers2 = {4,3,2}; //Kurzschreibweise - implizit Feldgröße 3 - idealerweise für Test verwenden
        numbers1[0] = 44;

        //Methoden, die boolean ausgeben -> if-Statement sinnvoll
        if (!swapArrays(new int[] {4,3,2}, new int[] {4})) {
            System.out.println("ERROR");
        }*/

    }
}