/*
By Interface, we can achieve 100% Abstraction
 An interface in Java is a blueprint of a class, Its tell to class only what to do(Not how to do)

An Interface in Java programming language is defined as an abstract type used to specify the
 behavior of a class. An interface in Java is a blueprint of a class. A Java interface contains
 static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods
in the Java interface, not the method body. It is used to achieve abstraction and multiple inheritance
in Java. In other words, you can say that interfaces can have abstract methods and variables.
It cannot have a method body. Java Interface also represents the IS-A relationship.
0. Abstract method and field is used in Interface
1. Till java 7 version all method are abstract method in Interface
2. In Interface all method is Public abstract type
3. If you create any field in then compiler automatic create public static fina int a=10;
if you write int a=10;
then compiler change it to  static fina int a=10;

4. in Java 8 we create default concert method in Interface but its return type must void
default void display()
{}
5. in java 8 also we can create static method in interface but only public static method
public static void run()
{
}
6. In java 9 Version we can also create private metjod






Like a class, an interface can have methods and variables, but the methods declared in an interface
are by default abstract (only method signature, no body).

1.Interfaces specify what a class must do and not how. It is the blueprint of the class.
2,An Interface is about capabilities like a Player may be an interface and any class implementing
Player must be able to (or must implement) move(). So it specifies a set of methods that the class has to implement.
3.If a class implements an interface and does not provide method bodies for all functions specified
 in the interface, then the class must be declared abstract.
4. A Java library example is Comparator Interface. If a class implements this interface,
then it can be used to sort a collection.



Why do we use an Interface?
1.It is used to achieve total abstraction.
2.Since java does not support multiple inheritances in the case of class, by using an interface it can achieve multiple inheritances.
3.It is also used to achieve loose coupling.
4.Interfaces are used to implement abstraction. So the question arises why use interfaces when we have abstract classes?
The reason is, abstract classes may contain non-final variables, whereas variables in the interface are final, public and static.
 */


package Interface;

interface A22
{
    void show();
}
public class InterfaceBasics implements A22{
    public static void main(String[] args) {

    }

    @Override
    public void show() {
        System.out.println("Ovveride method of interface");
    }
}


/*
1.In class, you can instantiate variables and create an object.
1.In an interface, you can’t instantiate variables and create an object.
2.	Class can contain concrete(with implementation) methods
2.The interface cannot contain concrete(with implementation) methods
3.	The access specifiers used with classes are private, protected, and public.
3In Interface only one specifier is used- Public.
 */