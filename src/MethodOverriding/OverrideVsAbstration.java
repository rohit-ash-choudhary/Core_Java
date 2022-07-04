/*
---- Note : Necessary to provide defination(ovveride) the abstract method in child class

We use the abstract keyword to create abstract classes and methods.
An abstract method doesn't have any implementation (method body).
A class containing abstract methods should also be abstract.
We cannot create objects of an abstract class.
To implement features of an abstract class, we inherit subclasses from it and create objects of the
subclass.
A subclass must override all abstract methods of an abstract class. However, if the subclass is
declared abstract, it's not mandatory to override abstract methods.
 */

package MethodOverriding;


abstract class Test
{
    abstract int add();

    public static void main(String[] args) {

    }
}
public class OverrideVsAbstration extends Test {
    public static void main(String[] args) {
        OverrideVsAbstration obj=new OverrideVsAbstration();
        obj.add();

    }

    public int add()
    {
        System.out.println("Override display method ");
        return 0;
    }
}
