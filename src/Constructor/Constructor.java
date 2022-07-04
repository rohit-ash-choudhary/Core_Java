/*
 1. Constructor is block similar to method same name as class
 2. Constructor is not return type even void
 3. Only modifiers applicable for constructor
 4. Constructor automatically excaute when we  create object

 Why We Use Constructor :
 1. there are multiple default value of



-Important Notes on Java Constructors
   1. Constructors are invoked implicitly when you instantiate objects.
   2. The two rules for creating a constructor are:
   3. The name of the constructor should be the same as the class.
   4. A Java constructor must not have a return type.
   5. If a class doesn't have a constructor, the Java compiler automatically creates a default constructor during run-time.
   The default constructor
   initializes instance variables with default values. For example, the int variable will be initialized to 0
Constructor types:
   1.No-Arg Constructor - a constructor that does not accept any arguments
   2. Parameterized constructor - a constructor that accepts arguments
   3. Default Constructor - a constructor that is automatically created by the Java compiler if it is not explicitly defined.
Note:
A constructor cannot be abstract or static or final.
A constructor can be overloaded but can not be overridden.
*/

package Constructor;
import java.util.*;
public class Constructor {
    String emp_name;    /* Compiler intialize defualt value of emp_name for obj1 & obj2 emp_name=null */
    int emp_id;         /* Compiler intialize defualt value of emp_name for obj1 & obj2 emp_id=0 */


    //Constructor
  /*  Constructor(int n,String name)
    {
        this.emp_id=n;
        this.emp_name =name;
    }

   */

    public static void main(String[] args) {

        Constructor obj1=new Constructor();
        obj1.emp_id=1;   //We can use this at palace of Constructor but take to time initialize value for every object
        obj1.emp_name="Rohit";
        Constructor obj2=new Constructor();
        obj1.emp_name="Jasan";//We can use this at palace of Constructor but take to time initialize value for every object
        obj1.emp_id=2;

        /*
        So we can do directly using Constructor like obj3 ,Basically Constructor is used for Initialize object
        Note : Constructor is not create object , object create by new keyword

        * */
       // Constructor obj3=new Constructor(1,"Somy");


    }
}
/*
Providing Constructors for Your Classes
A class contains constructors that are invoked to create objects from the class blueprint. Constructor declarations look like method declarations—except that they use the name of the class and have no return type. For example, Bicycle has one constructor:

public Bicycle(int startCadence, int startSpeed, int startGear) {
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
}
To create a new Bicycle object called myBike, a constructor is called by the new operator:

Bicycle myBike = new Bicycle(30, 0, 8);
new Bicycle(30, 0, 8) creates space in memory for the object and initializes its fields.

Although Bicycle only has one constructor, it could have others, including a no-argument constructor:

public Bicycle() {
    gear = 1;
    cadence = 10;
    speed = 0;
}
Bicycle yourBike = new Bicycle(); invokes the no-argument constructor to create a new Bicycle object
called yourBike.

Both constructors could have been declared in Bicycle because they have different argument lists.
As with methods, the Java platform differentiates constructors on the basis of the number of arguments
 in the list and their types. You cannot write two constructors that have the same number and type
 of arguments for the same class, because the platform would not be able to tell them apart.
 Doing so causes a compile-time error.

You don't have to provide any constructors for your class, but you must be careful when doing this.
The compiler automatically provides a no-argument, default constructor for any class without constructors. This default constructor will call the no-argument constructor of the superclass. In this situation, the compiler will complain if the superclass doesn't have a no-argument constructor so you must verify that it does. If your class has no explicit superclass, then it has an implicit superclass of Object, which does have a no-argument constructor.

You can use a superclass constructor yourself. The MountainBike class at the beginning of this lesson did just that. This will be discussed later, in the lesson on interfaces and inheritance.

You can use access modifiers in a constructor's declaration to control which other classes can call the constructor.

Note: If another class cannot call a MyClass constructor, it cannot directly create MyClass objects.
 */


/*
Q) Does constructor return any value?
Yes, it is the current class instance (You cannot use return type yet it returns a value).

Can constructor perform other tasks instead of initialization?
Yes, like object creation, starting a thread, calling a method, etc. You can perform any operation in the constructor as you perform in the method.

Is there Constructor class in Java?
Yes.

What is the purpose of Constructor class?
Java provides a Constructor class which can be used to get the internal information of a constructor in the class. It is found in the java.lang.reflect package.
 */