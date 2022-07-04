package Constructor;


/*

Q) What is the purpose of a default constructor?
The default constructor is used to provide the default values to the object like 0, null, etc.,
depending on the type.


If user not create the constructor then Compiler automatic create the constructor that used to
provide variable default value and  call the superclass constructor.
If we do not create any constructor, the Java compiler automatically create a no-arg constructor
 the execution of the program. This constructor is called default constructor.
Once a constructor is declared private, it cannot be accessed from outside the class. So,
 creating objects from outside the class is prohibited using the private constructor.

Here, we are creating the object inside the same class. Hence, the program is able to access
the constructor. To learn more, visit Java Implement Private Constructor.

However, if we want to create objects outside the class, then we need to declare the
constructor as public.
its look like this
Private DefaultConstructor
{
    super()
}
Public DefaultConstructor
{
    super()
}
 */
public class DefaultConstructor {
    int emp_id;
    int emp_name;
    public static void main(String[] args) {

        DefaultConstructor obj=new DefaultConstructor();

    }
}


