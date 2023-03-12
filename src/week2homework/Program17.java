package week2homework;
/**
 * 17. Write a Java program to convert a decimal number to binary number.
 */

import java.util.Scanner;

public class Program17 {

    public static void main(String[] args) {       //Declaring main method
        Scanner scanner= new Scanner(System.in);   //creating scanner class object

        System.out.println("Enter a Decimal Number: "); //Asking user to enter a decimal number
        int d= scanner.nextInt();                       //Taking input from user

        toBinary(d);                                    //calling static method

        scanner.close();
    }
    public static void toBinary(int d ){                //declaring static method
        String b = Integer.toBinaryString(d);           //storing the converted number to binary using .toBinaryString()
                                                       //method to b
        System.out.println("Binary number is: " + b);  //Printing the output for logic


    }


}
