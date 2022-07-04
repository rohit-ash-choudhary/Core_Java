/* -- Compile Time Polymorphism
//    0. Compiler decied at compile timing which method is need to excaute
//    1. In Compile time Polymorphism, the call is resolved by the compiler
//    2. It is also known as Static binding, Early binding and overloading as well.
//    3. Method overloading is the compile-time polymorphism where more than one methods
//    share the same name with different parameters or signature and different return type.
      4. It is achieved by function overloading and operator overloading
      5. It provides fast execution because the method that needs to be executed is known
      early at the compile time.
      6. Compile time polymorphism is less flexible as all things execute at compile time.
      7. Inheritance is not involved.

 -- 	Run time Polymorphism
     0. At runtime JVM decied which method need to excaute
     1. In Run time Polymorphism, the call is not resolved by the compiler.
     2. It is also known as Dynamic binding, Late binding and overriding as well.
     3. Method overriding is the runtime polymorphism having the same method with same parameters
      or signature but associated withcompared, different classes.
     4. It is achieved by virtual functions and pointers
     5. It provides slow execution as compare to early binding because the method
     that needs to be executed is known at the runtime.
     6. Run time polymorphism is more flexible as all things execute at run time.
     7. Inheritance is involved.

Note : What is binding
Binding is a mechanism creating link between method call and method actual implementation.
As per the polymorphism concept in Java , object can have many different forms.
Object forms can be resolved at compile time and run time


 */




package PolyMorphism;

public class CompileVsRunTimePolymorphism {
    public static void main(String[] args) {

    }
}
