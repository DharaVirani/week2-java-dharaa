package week2homework;
/**
 * 9. Write a program to convert the upper case to lower case.
 */

import java.util.Scanner;

public class Program9 {

    public static void main(String[] args) {           //Declare main method
        Scanner scanner = new Scanner(System.in);       //Calling class scanner

        System.out.println("Write your name: ");      //Printing for user
        String nm = scanner.nextLine();               //storing the user input in variable

        toLowerCase(nm);                              //calling static method

        scanner.close();

    }

    public static void toLowerCase(String name) {                              //created static method
        System.out.println("Your name in lower case:" + name.toLowerCase());  //Convert string in lower case
    }
}
