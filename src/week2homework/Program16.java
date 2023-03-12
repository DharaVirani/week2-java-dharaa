package week2homework;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 */
public class Program16 {
    public static void main(String[] args) {              //Declared main method
        Scanner scanner = new Scanner(System.in);          //Creating object for scanner class

        System.out.println("Input first binary number: "); //Asking user to enter a binary number
        String b1 = scanner.nextLine();

        System.out.println("Input second binary number: ");
        String b2 = scanner.nextLine();                   //taking input from the scanner class by user

        toBinary(b1, b2);                                 //Calling static method when user inputs 2 binary number

        scanner.close();
    }

    public static void toBinary(String b, String b1) {
        int a = Integer.parseInt(b, 2);  //converting binary string into integer format using parseInt() method
        int d = Integer.parseInt(b1, 2);
        int c = a + d;                                                                 //addition of two int numbers
        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(c)); //used toBinaryString() method
                                                                                     //to convert int to binary string

    }

}
