package week2homework;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme
 */
public class Program3 {
    int a = 20;                                   //declared instance variable
    static int b = 30;                           //declared static variable

    public static void main(String[] args) {    //declared main method
        Program3 obj = new Program3();
        obj.myMethod();                            //called instance method in main method using object
        staticMethod();                           //called static method directly
    }


    public void myMethod() {                  //declare  instance method
        System.out.println(a);               //called instance variable in instance method inside print statement
        System.out.println(b);               //called static variable inside instance method directly inside print stat
    }

    public static void staticMethod() {        //declare static method
        System.out.println(b);                //called static variable in static method directly inside print statement
        Program3 obj = new Program3();          //created object to call instance variable in static method inside print-
        System.out.println(obj.a);          //statement
    }
}




