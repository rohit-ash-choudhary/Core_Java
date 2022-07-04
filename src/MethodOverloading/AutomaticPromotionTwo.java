/*
Object is parent class of all class
if child class is available and parent class avaible
then in method overloading compiler called child class method
 */
package MethodOverloading;

public class AutomaticPromotionTwo {

    public static void main(String[] args) {
        AutomaticPromotionTwo obj=new AutomaticPromotionTwo();
        System.out.println(obj.add('a'));

    }


    public int add(Object a)
    {
        System.out.println("Int Method");
        return 0;
    }
    public String add(String a, String b)
    {
        System.out.println("String Method");
        return null;
    }
}
