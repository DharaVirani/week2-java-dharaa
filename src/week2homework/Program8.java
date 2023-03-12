package week2homework;

import java.util.Scanner;

/**
 * 8.Write a program to calculate the area of a triangle.
 */

public class Program8 {
    public static void main(String[] args) {                 //Declared main method
        Scanner scanner = new Scanner(System.in);            //Creating object for scanner class

        System.out.println("Enter base of the triangle: ");  //Printing statement for the user
        float triangle = scanner.nextFloat();                // Reading input of the user

        System.out.println("Enter height of the triangle: "); // Printing statement for user
        float triangle1 = scanner.nextFloat();                //Reading input for user

        Program8 obj = new Program8();                       //Calling instance method by creating objects
        obj.areaOfTriangle(triangle, triangle1);

        scanner.close();
    }

    public void areaOfTriangle(float b, float h) {              //declaring instance method
        float area = (b * h) / 2;                               //logic of the program
        System.out.println("The area of triangle is: " + area); //Printing the output by concat and applying the logic
    }
}
