/*
There are some rules we need to follow to overload a method. Some of them are mandatory while some are optional.

Two methods will be treated as overloaded if both follow the mandatory rules below:

1.Both must have the same method name.
2.Both must have different argument lists.
3.And if both methods follow the above mandatory rules, then they may or may not:

1.Have different return types.
2.Have different access modifiers.
3.Throw different checked or unchecked exceptions.


Method overloading can be done by changing:

1.The number of parameters in two methods.
2.The data types of the parameters of methods.
3. The Order of the parameters of methods.
 */

package MethodOverloading;

public class BasicMethodOverloading {
    public static void main(String[] args) {

        BasicMethodOverloading obj=new BasicMethodOverloading();
        obj.add(3,5,5);// Called First method
        obj.add(3,"ABC");  //Called second method
        obj.add("Java","Lan");////Called third method

    }

   public int add(int a,int b, int c)
   {
       return a+b+b;
   }
   public String add(int a, String b)
   {
       return a+b;
   }
   public String add(String a,String b)
   {
       return a+b;
   }
}
