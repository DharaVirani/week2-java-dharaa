package week2homework;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog
 */

public class Program19 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String b = scanner.nextLine();

        toLowerCase(b);

        scanner.close();

    }

    public static void toLowerCase(String str) {

        System.out.println(str.toLowerCase()); //Using toLowerCase() method to convert string to lower case
    }
}
