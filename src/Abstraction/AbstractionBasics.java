/*



Data abstraction is the process of hiding certain details and showing only essential information to
the user.
Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about
in the next chapter).

The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
Abstract method: can only be used in an abstract class, and it does not have a body.
The body is provided by the subclass (inherited from).


By Abstract : We can achieve 0-100 % Abstraction
By Interface: We can achieve 100 % Abstraction

Note:
1.In Abstract class : there is may be abstract and concert method also
2. If in any class there is abstract method then make those class abstract that compulsory
3. If any class inherit Abstract class its compulsory to make body(give defination) to all abstract method
at time of override
4. Its compulsory to override abstract method in child class otherwise its give compile time error
5. We are not create are also not able to create object of Abstract class but
    we can create reference  of Abstract class,  The reference  is used to refer to
    the objects of derived classes (subclasses of abstract class).
//Doubt how create refernce of Abstract class
 */

package Abstraction;
abstract class Vechile
{
    int num_of_tryes;
    public abstract void start();
}


public class AbstractionBasics extends Vechile {
    int num_of_tryes=2;
    public static void main(String[] args) {

    }

    @Override
    public void start() {
        System.out.println("Start with kic");
    }
}
class Car extends Vechile
{

    public static void main(String[] args) {
        Car r=new Car();
       /* AbstractionBasics abc;
        ab=r;*/ //this is exmple how create reference of Abstract class
    }
    int um_of_tryes=4;
    @Override
    public void start() {
        System.out.println("Start wiht key");
    }
}
