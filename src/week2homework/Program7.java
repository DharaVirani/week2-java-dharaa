package week2homework;

import java.util.Scanner;

/**
 * 7.Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Program7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);             //creating scanner class object

        System.out.println("Insert degree in Fahrenheit: "); //Printing for user to ask
        float f = scanner.nextFloat();                        //Read input from user

        Program7 obj = new Program7();                       //called instance method by creating object
        obj.convertToCelsius(f);

        scanner.close();
    }

    public void convertToCelsius(float f) {                      //declared instance method
        float celsius = ((f - 32) * 5) / 9;                         //logic to convert
        System.out.println("Degree in celsius is: " + celsius); //Printing the output with the logic applied
    }


}

