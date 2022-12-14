package at.ac.fhcampuswien;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static


//Aufgabe 1
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

//Aufgabe 2
    public static long[] lcg(long seed) {
        final long m = (long) Math.pow(2, 31);
        final int c = 12345;
        final int a = 1103515245;

        long[] numbers = new long[10];

        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                numbers[i] = (a * seed + c) % m;
            } else {
                numbers[i] = (a * numbers[i - 1] + c) % m;
            }
        }
        return numbers;
    }

        //Aufgabe 3

    public static void guessingGame(int numberToGuess) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("Guess number " + i + ": ");
            int guessing = scan.nextInt();
            if (i == 10) {
                if (numberToGuess!= guessing) {
                    System.out.println("You lost! Have you ever heard of divide & conquer?");
                    break;
                } else {
                    System.out.println("You won wisenheimer!");
                }
            }
            if (numberToGuess < guessing) {
                System.out.println("The number AI picked is lower than your guess.");
            } else if (numberToGuess > guessing) {
                System.out.println("The number AI picked is higher than your guess.");
            } else {
                System.out.println("You won wisenheimer!");
               break;
            }
        }
    }


    public static int randomNumberBetweenOneAndHundred() {
        Random numb = new Random();
        return numb.nextInt(99) + 1;
    }

    // Aufgabe 4
            public static boolean swapArrays(int [] arr1, int [] arr2) {

                int arrayLength1=arr1.length;
                int arrayLength2=arr2.length;
                if (arrayLength1 != arrayLength2) {
                    return false;
                } for (int i = 0; i < arrayLength1; i++) {
                    int array3 = arr2[i];
                    arr2[i] = arr1[i];
                    arr1[i] = array3;

                } return true;

            }
//Aufgabe 5

    public static String camelCase(String textInput) {
        char[] inputArr = textInput.toCharArray();

        for (int i = 0; i < inputArr.length; i++) {
            if (i == 0) {
                    if (inputArr[i] >= 'a' && inputArr[i] <= 'z') {
                        inputArr[i] -= 32;
                    }
            }
                if (i >= 1 && inputArr[i - 1] == ' ' && inputArr[i] >= 'a' && inputArr[i] <= 'z') {
                    inputArr[i] -= 32;
                }
                if (i >= 1 && inputArr[i - 1] != ' ' && inputArr[i] >= 'A' && inputArr[i] <= 'Z') {
                    inputArr[i] += 32;
                }
            }
        // muss in eigener for-Schleife sein - Gro??buchstaben sonst nicht mehr m??glich
        for(int i = 1; i < inputArr.length; i++)
        if (inputArr[i] >= 0 && inputArr[i] <= '@' || inputArr[i] >= '[' && inputArr[i] <= 96 || inputArr[i] >= 123 && inputArr[i] <= 127) {
            inputArr[i] = ' ';
        }
            return String.valueOf(inputArr).replace(" ","");
        }




//Aufgabe 6
            public static int checkDigit(int[] code) {
                int sum = 0;
                int x;
                for (x = 0;  x < code.length; x++) {
                    sum = sum + code[x] * (x+2);
                }
                int sum2 = sum % 11;
                int number = 11 - sum2;

                if (number == 10) {
                    return 0; }
                if (number == 11) {
                    return 5;
                } else
                return number;
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


        System.out.println(Arrays.toString(lcg(1)));


        guessingGame(randomNumberBetweenOneAndHundred());;


        swapArrays(new int[]{1,3,4,5}, new int[]{2, 3, 5});


       /* Mitschrift 3. ??bung:
       for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]); //um Argumente in der Main-Methode auszugeben;
        }

        //Test der Methode / Methodenaufruf im Fall von void:
        oneMonthCalendar(31,7);


        "einfangen des Wertes" Bsp. 4
        als Bsp: Array inline / Variable als Zwischenspeicher!
        boolean returnValue = swapArrays(new int[]()...)
        eigentlich:
        int []numbers1 = new int[10]; //Feld der Gr????e 10 wird erstellt
        numbers1[0] = 44; //Index 0 - Wert 44
        int x = numbers1[9];

        int []numbers2 = {4,3,2}; //Kurzschreibweise - implizit Feldgr????e 3 - idealerweise f??r Test verwenden
        numbers1[0] = 44;

        Methoden, die boolean ausgeben -> if-Statement sinnvoll
        if (!swapArrays(new int[] {4,3,2}, new int[] {4})) {
            System.out.println("ERROR");
        }
        */

    }
}