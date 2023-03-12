package week2homework;

/**
 * 2. Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programm
 */
public class Program2 {

    static int a = 20;                //declared static variable
    static int b = 30;

    public static void main(String[] args) {
        myMethod();                   //called static method in main method
    }


    public static void myMethod() {    //declared one static method
        System.out.println(a);        //called static variables inside print statement
        System.out.println(b);


    }

}
