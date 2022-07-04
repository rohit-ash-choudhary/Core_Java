/*
no automatic promotion work in cases of multiple argument
exmple below
 */
package MethodOverloading;

public class AutomationPromotionThree {
    public static void main(String[] args) {

        AutomationPromotionThree obj=new AutomationPromotionThree();
        obj.add(34,45f);
        obj.add(35f,45);
        // obj.add(34,56); //No automatic promotion -reference to add is ambiguous
    }
    public int add(int a,float b)
    {
        System.out.println("Int Method ,float method");
        return 0;
    }
    public String add(float a, int b)
    {
        System.out.println("float Method ,int method ");
        return null;
    }
}
/*
Explanation: In the above code, when we pass arguments to a method call,
the compiler will search for the corresponding method that accepts the same arguments. If present, then it will call that method. Else, it will look for scenarios for automatic type promotion.

For the first method call, there is already a method that accepts similar arguments,
 so that it will call that Integer-Double method.
For the second method call also there is a method defined in the class
, and the compiler will call the respective method. (Double-Integer)
But when we pass 2 Integers as arguments, the Compiler first checks for a
respective method that accepts 2 integers. In this case, there is no method that accepts two integers. So it will check for scenarios for type promotion.
Here there are 2 methods that accept an integer and double and any of the integers can be promoted to double simply, but the problem is ambiguity. The compiler didn&rsquo;t know what method to call if the type was promoted. So compiler throws an error message like specified below if we uncomment line 20 in the above code-
 */