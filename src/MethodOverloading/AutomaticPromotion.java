/*
What is Automatic Type Promotion?
The name Type Promotion specifies that a small size datatype can be promoted to a large size datatype.
 i.e., an Integer data type can be promoted to long, float, double, etc. This Automatic Type Promotion
 is done when any method which accepts a higher size data type argument is called with the smaller data
 type.

1.byte can be promoted to <byte - short - int - long - float - double>.
2.short can be promoted to <short - int - long - float - double>.
3.int can be promoted to <int - long - float - double>.
4.long can be promoted to <long - float - double>.
5.char can be promoted to <char - int - long - float - double>.
6. float can be promoted to <float - double>.
 */

package MethodOverloading;

public class AutomaticPromotion {

    public static void main(String[] args) {
         AutomaticPromotion obj=new AutomaticPromotion();
        System.out.println(obj.add('a','a'));

    }


    public int add(int a,int b)
    {
        return a+b+5;
    }
    public String add(String a, String b)
    {
        return a+b;
    }
}
