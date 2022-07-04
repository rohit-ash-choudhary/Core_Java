/*
The reason behind this is to prevent ambiguity.
Consider a case where class B extends class A and Class C and both class A and C have the same
method display().
Now java compiler cannot decide, which display method it should inherit. To prevent such situation,
multiple inheritances is not allowed in java.
 */


package Inhertance;
import java.util.*;
public class MultipleInheritance {
    public static void main(String[] args) {

    }
    public int mul(int a,int b)
    {
        return a*b;
    }

}

class CC{
    public static void main(String[] args) {

    }
    public int mul(int a,int b)
    {
        return a*b;
    }

}

/*class DD extends MultiLevelInheritance, CC
{
    public static void main(String[] args) {
        DD obj=new DD();
        // obj.mul(4,3)

        // ss. The problem occurs when there exist methods with the same signature in both
        // the superclasses and subclass. On calling the method, the compiler cannot determine which
        // class method to be called and even on calling which class method gets the priority.
    }
}

 */
