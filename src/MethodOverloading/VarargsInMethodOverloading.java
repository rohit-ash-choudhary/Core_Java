/*
Overloading allows different methods to have same name, but different signatures where signature can
 differ by number of input parameters or type of input parameters or both

Sometimes unexpected errors can result when overloading a method that takes a variable length argument.
These errors involve ambiguity because both the methods are valid candidates for invocation. The compiler cannot decide onto which method to bind the method call.

 show() this give ambiguity same len you provide /zero len you provide
 */

package MethodOverloading;

public class VarargsInMethodOverloading {
    public static void main(String[] args) {

        VarargsInMethodOverloading obj=new VarargsInMethodOverloading();
        obj.add(3);
        obj.add(3,6,5);


    }
    public void add(int a)
    {
        System.out.println("Int Method");
    }

    public void add(int... a)
    {
        System.out.println("Varargs Method");
    }
}
