/*
The final keyword in java is used to restrict the user. The java final keyword can be used in many
 context. Final can be:

variable
method
class
The final keyword can be applied with the variables, a final variable that have no value it is
called blank final variable or uninitialized final variable. It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only. We will have detailed learning of these. Let's first learn the basics of final keyword.

final keyword in java
1) Java final variable
If you make any variable as final, you cannot change the value of final variable(It will be constant).
2) Java final method
If you make any method as final, you cannot override it.
3) Java final class
If you make any class as final, you cannot extend it.
 */
package Final_Keyword;

public class WhyFinal {
    final static int num=34;


    public static void main(String[] args) {
         // num=343;
        /* This line give error java: cannot assign a value to final variable num */

        WhyFinal obj=new WhyFinal();

        System.out.println(obj.num);


    }
}
