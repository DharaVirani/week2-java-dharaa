package week2homework;

import java.util.Scanner;

/**
 * 13. Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers
 */
public class Program13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);         //calling object for scanner class

        System.out.println("Enter a number: ");            //Printing for the use
        double n1 = scanner.nextDouble();                   //Reading input

        System.out.println("Enter 2nd number: ");
        double n2 = scanner.nextDouble();

        System.out.println("Enter 3rd number: ");
        double n3 = scanner.nextDouble();

        averageNumber(n1, n2, n3);                  //calling static method

        scanner.close();

    }

    public static void averageNumber(double a, double b, double c) {  //creating static method
        double result = (a + b + c) / 3;
        System.out.println("The average number is: " + result);     //printing output

    }


}
