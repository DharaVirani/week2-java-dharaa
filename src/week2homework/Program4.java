package week2homework;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program4 {

    int a = 20;              //declared instance variable
    int b = 30;              //declared another instance variable
    static int c = 40;      //declared static variable
    static int d = 50;      //declared another static variable


    public static void main(String[] args) {   //declared main method
        Program4 obj = new Program4();        //called instance method by using object because instance belongs to object
        obj.myMethod();
        staticMethod();                       //called static method directly because static to static it accepts

    }


    public void myMethod() {                 //declared one instance method
        System.out.println(a);              //called instance variable in instance method
        System.out.println(b);              //called instance variable in instance method
        System.out.println(c);             //called static variable in instance variable directly
        System.out.println(d);             //called static variable in instance variable directly
    }

    public static void staticMethod() {   //declared one static method
        System.out.println(d);           //called static variable in static method directly
        System.out.println(c);           //called static variable in static method directly
        Program4 obj = new Program4();   //called instance variable in static method using object
        System.out.println(obj.b);
        Program4 obj1 = new Program4();  //called instance variable in static method using object
        System.out.println(obj.a);
    }

}
