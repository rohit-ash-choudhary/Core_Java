/*
The super keyword refers to superclass (parent) objects.

It is used to call superclass methods, and to access the superclass constructor.

The most common use of the super keyword is to eliminate the confusion between superclasses and
subclasses that have methods with the same name.
 */
package MethodOverriding;

public class SuperKeyWordVsOverride {
    public static void main(String[] args) {

    }
    public int add(int a,int b)
    {
        System.out.println("Super class method");
        System.out.println(a+b);
        return a+b;
    }
}
class XXXXX extends SuperKeyWordVsOverride
{


    public static void main(String[] args) {
        XXXXX obj=new XXXXX();
        int num=obj.add(5,6);
        System.out.println(num);





    }
    public int add(int a,int b)
    {
        super.add(a,b);
        System.out.println("child class class method");
        return a*b;
    }


}
