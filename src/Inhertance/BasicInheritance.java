/* Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors
 of a parent object
he idea behind inheritance in Java is that you can create new classes that are built upon existing
 classes. When you inherit from an existing class, you can reuse methods and fields of the parent class.
 Moreover, you can add new methods and fields in your current class also.

Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

Why use inheritance in java
1. For Method Overriding (so runtime polymorphism can be achieved).
2. For Code Reusability.

Cons of Inheritance :
1. Tightly coupled

What is not Inheritance in Java :
1. private fields and methods and
2. Constructors. Although, the subclass constructor has to call the superclass constructor if its defined (More on that later!)
3. Multiple classes. Java supports only single inheritance, that is, you can only inherit one class at a time.
4. Fields. Individual fields of a class cannot be overriden by the subclass.

Upcasting:

Present_class object =new child_class() //upcasting allowed
Child_class object =new Present_class  //Error

10-4-4: Which of the following reasons for using an inheritance hierarchy are valid?

        Object methods from a superclass can be used in a subclass without rewriting or copying code.

        Objects from subclasses can be passed as arguments to a method that takes an argument of the parent type.

        Objects from subclasses can be stored in the same array of the parent type.

        All of the above

        answer: All Class //Doubts
 */
package Inhertance;

public class BasicInheritance {
    public static void main(String[] args) {

    }

    public int add(int a,int b)
    {
        return a+b;
    }
    public int mul(int a,int b)
    {
        return a*b;
    }
}

class Child extends BasicInheritance
{
    public static void main(String[] args) {

        Child obj=new Child();
        obj.add(5,6);

        BasicInheritance obj1=new Child();  //Upcasting allowed

        //  Child obj2=  new BasicInheritance(); //ERROR NOT ALLOWED


    }
    public float div(int a,int b){
        return a/b;
    }
}

/*
Why multiple inheritance is not supported in java?
To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes.
 A and B classes have the same method and you call it from child class object, there will be
 ambiguity to call the method of A or B class.

Since compile-time errors are better than runtime errors, Java renders compile-time error if
 you inherit 2 classes. So whether you have same method or different, there will be compile
 time error.
 */