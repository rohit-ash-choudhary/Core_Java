/* Q. Can we achieve method overloading by change return Type

No, you cannot overload a method based on different return type but same argument type and number in java.

In overloading it is must that the both methods have −

same name.
different parameters (different type or, different number or both).
The return type doesn’t matter. If they don’t have different parameters,
 they both are still considered as same method and a compile time error will be generated.


 */


package MethodOverloading;

public class MethodOverloadingByChangeReturnType {

    public static void main(String[] args) {

        MethodOverloadingByChangeReturnType obj=new MethodOverloadingByChangeReturnType();
        // obj.show(3);
    }
/*
    void show(int a)
    {
        System.out.println("Void return type");
    }

    String show(int a)
    {
        System.out.println("String return type");
        return null;
    }
    // can't overload
 */
}
