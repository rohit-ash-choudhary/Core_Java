/*
There can be a lot of usage of Java this keyword. In Java, this is a reference variable that
refers to the current object.

Here is given the 6 usage of java this keyword.

1.this can be used to refer current class instance variable.
2.this can be used to invoke current class method (implicitly)
3.this() can be used to invoke current class constructor.
4. this can be passed as an argument in the method call.
5. this can be passed as argument in the constructor call.
6. this can be used to return the current class instance from the method.
 */
package This_Keyword;

public class ThisKeyword {

    int k;

    public static void main(String[] args) {
        ThisKeyword obj=new ThisKeyword();
        ThisKeyword obj2=new ThisKeyword();
        obj.setKValue();
        System.out.println(obj.k);// Instance Variable refer current object
        System.out.println(obj2.k); //zero as this is refer to first object

    }
    public void setKValue()
    {
        int k=34;
        this.k=10;
        System.out.println(k); //local variable

    }


}
