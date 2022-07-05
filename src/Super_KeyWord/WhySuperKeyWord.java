/*
The super keyword in Java is a reference variable which is used to refer immediate parent class object.

Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

Usage of Java super Keyword
1.super can be used to refer immediate parent class instance variable.
2.super can be used to invoke immediate parent class method.
3 super() can be used to invoke immediate parent class constructor.
 */


package Super_KeyWord;



public class WhySuperKeyWord {
    int i=50;

}

class No extends WhySuperKeyWord
{
    int i=20;
    public static void main(String[] args) {
        No objj=new No();
        objj.show(4);

    }
    void show(int ab)
    {
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(super.i);
    }


}
