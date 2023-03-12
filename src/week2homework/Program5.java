package week2homework;

import java.util.Scanner;

/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Program5 {

    public static void main(String[] args) {      //declared main method
        Scanner scanner = new Scanner(System.in); //scanner class object created

        System.out.println("Enter number:");      //Printing statement for user
        int a = scanner.nextInt();                //Taking input from user and storing that in variable a

        System.out.println("Enter number");       //Printing statement for the user
        int b = scanner.nextInt();                //Taking another input from the user

        Program5 obj = new Program5();            //Creating object to call instance methods
        obj.addition(a, b);
        obj.subtraction(a, b);
        multiplication(a, b);                    //Called static method directly
        division(a, b);

        scanner.close();
    }

    //No return type with parameters methods
    public void addition(int a, int b) {          //declared one instance method
        int ans = a + b;                          //logic of addition
        System.out.println("Addition of the numbers is: " + ans);
    }

    public void subtraction(int a, int b) {       //declared another instance method
        int ans = a - b;                          //logic of subtraction
        System.out.println("Subtraction of the numbers is: " + ans); //Printing the output using concatenation and logic

    }

    public static void multiplication(int a, int b) { //declared one static method
        int ans = a * b;                             //logic of multiplication
        System.out.println("Multiplication of the numbers is: " + ans); //Printing the output
    }

    public static void division(int a, int b) {      //declaring another static method
        int ans = a / b;                             //logic of division
        System.out.println("Division of the numbers is: " + ans); //Printing the output
    }

}