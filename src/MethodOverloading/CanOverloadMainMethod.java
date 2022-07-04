/*
    Q. Can we override the main Method

    Yes, we can overload the main method in Java, but When we execute the class JVM starts execution
    with public static void main(String[] args) method.

 */

package MethodOverloading;

public class CanOverloadMainMethod {
    public static void main(String[] args) {

        System.out.println("Main method");
        CanOverloadMainMethod obj=new CanOverloadMainMethod();
        obj.main(7);
    }

    public static void main(int a) {

        System.out.println("Main method for override");

    }
}
