/*
Java final method
If you make any method as final, you cannot override it.
 */

package Final_Keyword;

public class FinalMethod {
    public static void main(String[] args) {

    }
    final int add(int a, int b)
    {
        return a+b;
    }
}

class Child extends FinalMethod{

    public static void main(String[] args) {

    }
    /* we can't able to override final method
      ava: add(int,int) in Final_Keyword.Child cannot override add(int,int) in Final_Keyword.FinalMethod
overridden method is final
  */
    /*
    public int add(int a, int b)

    {
        return  a*b;
    }

     */
}
