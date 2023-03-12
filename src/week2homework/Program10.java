package week2homework;

import java.util.Scanner;

/**
 * 10. Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 */
public class Program10 {

    public static void main(String[] args) {               //Declared main method
        Scanner scan = new Scanner(System.in);             //Created object for scanner class

        System.out.println("Enter a number :");            //Asking for user input
        int num = scan.nextInt();                          //Reading the user input

        multiplication(num);                               //Calling static method in main method

        scan.close();
    }

    public static void multiplication(int num) {            //Declaring static method
        System.out.println(num + "x" + 1 + "=" + num);      //Printing user input number with multiplication for output
        System.out.println(num + "x" + 2 + "=" + num * 2);
        System.out.println(num + "x" + 3 + "=" + num * 3);
        System.out.println(num + "x" + 4 + "=" + num * 4);
        System.out.println(num + "x" + 5 + "=" + num * 5);
        System.out.println(num + "x" + 6 + "=" + num * 6);
        System.out.println(num + "x" + 7 + "=" + num * 7);
        System.out.println(num + "x" + 8 + "=" + num * 8);
        System.out.println(num + "x" + 9 + "=" + num * 9);
        System.out.println(num + "x" + 10 + "=" + num * 10);


    }
}
