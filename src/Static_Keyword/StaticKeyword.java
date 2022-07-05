/*
Link : 1. https://www.javatpoint.com/static-keyword-in-java
2. https://javaconceptoftheday.com/access-and-non-access-modifiers-in-java/#:~:text=Access%20modifiers%20are%20used%20to,serialization%20of%20a%20variable%20etc.
 [Static Key word is non-access modifier]

Where We can use static keyword:
1. With Variable (only class level : Not local)
2. With Method
3. With Block
4. With Class (Only in inner not out class)

Static Variable :
    1. Only Class level variable is static variable
    2. Static variable is default value
    3. Static variable can access direct through class becoz static varibale belog to class not to object
Why Static We Make Static Variable:
    1. Memory Management

Java provides two types of modifiers. One is Access Modifiers and another one is Non-Access Modifiers.
Access modifiers are used to control the visibility of a class or a variable or a method or a constructor.
Where as non-access modifiers are used to provide other functionalities like synchronizing a method or
block, restricting the serialization of a variable etc. In this post, we will discuss what are access
and non-access modifiers in Java.

Access Modifier :
access modifiers are used to control the visibility of a class or a method or a variable or a constructor.
There are 4 different access modifiers are available in Java. They are – private, default
(or no access modifier), public and protected.
1. private : private members of a class, whether it is a field or a method or a constructor,
can not be accessed outside the class in which they are defined. private members are also not inherited
to sub class.

2.default : default members or members with no access modifier are visible within the package.
And they are inherited to only sub classes which reside in the same package. That means they are not inherited and visible outside the package.

3.public : public members are visible everywhere and they are inherited to any sub class.

4.protected : protected members have half the characteristics of public members and half the
characteristics of default members. i. e protected members are visible within package like default
members and they can be inherited to any sub class just like public members.

Non-Access Modifier :

Java provides some other modifiers to provide the functionalities other than the visibility.
These modifiers are called Non-Access Modifiers. There are many non-access modifiers available in Java.
Each modifier have their own functionality. Some of the most used non-access modifiers are listed below.

1.static : The members which are declared as static are common to all instances of a class.
Static members are class level members which are stored in the class memory. Click here for more info on
static members.

2.final : This modifier is used to restrict the further modification of a variable or a method or a class.
The value of a variable which is declared as final can’t be modified once it gets a value.
A final method can not be overridden in the sub class and you can not create a sub class to a final class.
See this post for more info on final keyword in Java.

3.abstract : This modifier can be used either with a class or with a method.
You can not apply this modifier to variable and constructor. A method which is declared as abstract
must be modified in the sub class. You can’t instantiate a class which is declared as abstract.
See this post for more info on abstraction in Java.

4.synchronized : This modifier is used to control the access of a particular method or a block by
multiple threads. Only one thread can enter into a method or a block which is declared as synchronized.
Click here for more info on synchronization in Java.

5.transient : This modifier is used in serialization process. A variable which is declared as transient
will not be serialized during object serialization.

6.volatile : volatile modifier is used in multi threaded programming. If you declare a field as
volatile it will be signal to the threads that it’s value must be read from the main memory rather
then their own stack. Because volatile field is common to all threads and it will be updated frequently
by multiple threads.

7.strictfp : This modifier is used for floating-point calculations. This keyword ensures that you will
get same floating point presentation on every platform. This modifier makes floating point variable
more consistent across multiple platforms.
 */


package Static_Keyword;


class Test
{
    static String emp_name;

    String name;
    String company; //static String company="Amazon"; declare like this

    Test(String a, String b)
    {
        this.name=a;
        this.company=b;
    }

    public static void main(String[] args) {
        Test obj=new Test("a","Amazon");
        Test obj2=new Test("a","Amazon");
        Test obj3=new Test("a","Amazon");
        Test obj4=new Test("a","Amazon");
        /*
        Here Company is same to every time its stored in memory with respect object so if
        we declare company variable static then its its class level and same for all object
        and stored in memory single time so also save memory
         */
    }
}
public class StaticKeyword {
    int emp_id;
    static String company_name="Google";

    StaticKeyword(int i)
    {
        this.emp_id=i;
    }

    public static void main(String[] args) {

        //System.out.println(emp_name); --direct not able to access but through class we can access direct
        System.out.println(Test.emp_name);
        StaticKeyword obj=new StaticKeyword(1);
        StaticKeyword obj2=new StaticKeyword(2);
        StaticKeyword obj3=new StaticKeyword(3);

        /* here company_name for every object is same as google as variable declared as static */




    }
}
