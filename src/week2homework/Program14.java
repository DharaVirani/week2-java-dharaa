package week2homework;

import java.util.Scanner;

/**
 * 14.Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 *  Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Program14 {

    public static void main(String[] args) {                  //Declaring main method
        Scanner scanner = new Scanner(System.in);             //Object created for scanner clss

        System.out.println("Enter width of the rectangle: "); //Asking user for input
        double rec = scanner.nextDouble();                    //Reading input

        System.out.println("Enter length of the rectangle: "); //Asking user for another input
        double rec2 = scanner.nextDouble();                    //Reading input from user

        Program14 obj = new Program14();                       //Calling instance method by creating object
        obj.myRectangle(rec, rec2);

        scanner.close();
    }

    public void myRectangle(double l, double h) {                //Declaring instance method
        System.out.println("Area is " + h + " * " + l + " = " + l * h); //Area of rectangle
        System.out.println("Perimeter is " + "2" + " * " + "(" + l + " + " + h + ")" + " = " + 2 * (l + h)); //Perimeter
    }
}
