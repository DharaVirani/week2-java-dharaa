package week2homework;

/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Program1 {

    int a = 20; //declared one instance variable
    int b = 30;  //declared 2nd instance variable

    public static void main(String[] args) {    //declare main method
        Program1 obj = new Program1();          //called the instance method in main method to run
        obj.myMethod();


    }

    // Created instance method: No return type no parameters
    public void myMethod() {    //instance method created
        System.out.println(a);  //call both instance variable into instance method inside print statement
        System.out.println(b);

    }
}
