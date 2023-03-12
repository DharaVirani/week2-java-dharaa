package week2homework;

import java.util.Scanner;

/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

public class Program18 {
    public static void main(String[] args) {       //Declaring main method
        Scanner scanner = new Scanner(System.in);  //Creating object for scanner class

        System.out.println("Enter first number: "); //Asking for user input
        int a= scanner.nextInt();                   //Reading the integer input from user

        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        Program18 obj= new Program18();               //Calling instance method by creating object
        obj.myCalculations(a,b);

        scanner.close();

    }
    public void myCalculations(int a, int b){          //Declaring instance method with args
        int n= a+b;                                    //creating logic of addition and storing in variable n
        int n1= a-b;                                   //subtraction
        int n2= a*b;
        int n3= a/b;
        int n4= a%b;
        System.out.println("Addition of the number is :" + n);       //Printing the output using concat and logic
        System.out.println("Subtraction of the number is :" + n1);
        System.out.println("Multiplication of the number is :" + n2);
        System.out.println("Division of the number is :" + n3);
        System.out.println("Modulus of the number is :" + n4);
    }
}
