package week2homework;

import java.util.Scanner;

/**
 * 6. Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r)
 */
public class Program6 {

    public static void main(String[] args) {                     //called main method
        Scanner scanner = new Scanner(System.in);                 //Used for keyboard input by user

        System.out.println("Enter radius value of the circle: "); //Printing for user to ask what to enter
        double d = scanner.nextDouble();                           //Input can be read from the user

        findACircle(d);                                            //called static method

        scanner.close();

    }

    public static void findACircle(double r) {                     //Created static method findACircle
        double area = Math.PI * r * r;                              //logic of the area with Math.PI
        System.out.println("Area of the circle is:" + area);        //Printing the output
    }
}
