package week2homework;

import java.util.Scanner;

/**
 * 15. Write a Java program to swap two variables.
 */
public class Program15 {
    public static void main(String[] args) {             //Declaring main method
        int x, y, z;                                     //Declaring local variable
        Scanner scanner = new Scanner(System.in);         //Created object for scanner class

        System.out.println("Input the first number: "); //Asking user for first number
        x = scanner.nextInt();                             //Reading the number entered by user

        System.out.println("Input the second number: "); //Asking user to input another number
        y = scanner.nextInt();                           //Reading input from user

        swapVariables(x, y);                             //calling static method when user enters the input

        scanner.close();
    }

    public static void swapVariables(int x, int y) {       //Declaring static method
        int z = x;                                        //Creating 3rd variable to swap and assign one variable to that
        x = y;                                           //Assigning x to y
        y = z;                                           //Assigning y to z in 3rd variable temporary one
        System.out.println("Swapped values are: " + x + " and " + y); //Printing output
    }
}
