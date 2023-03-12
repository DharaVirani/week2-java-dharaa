package week2homework;

import java.util.Scanner;

/**
 * 12. Write a Java program to compute the specified expressions and print the
 * output.
 */
public class Program12 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);          //Scanner declaration

        System.out.println("Enter number a: ");          //Printing for user to input
        double a= scanner.nextDouble();                 //Taking the user input

        System.out.println("Enter number b: ");
        double b= scanner.nextDouble();

        System.out.println("Enter number c: ");
        double c= scanner.nextDouble();

        System.out.println("Enter number d: ");
        double d= scanner.nextDouble();

        calculations(a,b,c,d);                           //calling the static method
        scanner.close();
    }
    //created static method
    public static void calculations(double a, double b, double c, double d){
        double result = (((a * b) - (b * b)) / (c - d)); //logic
        System.out.println(result);                      //print the output

    }
}
