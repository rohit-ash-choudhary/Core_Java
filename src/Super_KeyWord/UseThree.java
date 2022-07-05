package Super_KeyWord;

import This_Keyword.UsesThree;

/*
super() can be used to invoke immediate parent class constructor.
 */
public class UseThree {
    UseThree()
    {
        System.out.println("Constructor of class A");
    }
}
class BBB extends UseThree
{
    BBB()
    {
        super(); //Automatic put even not write manaully
        System.out.println("Constructor of class B");
    }

    public static void main(String[] args) {
        BBB obj=new BBB();
    }
}