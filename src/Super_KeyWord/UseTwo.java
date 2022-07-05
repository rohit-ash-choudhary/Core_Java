package Super_KeyWord;
/*
2.super can be used to invoke immediate parent class method.
 */
public class UseTwo {
    void m1()
    {
        System.out.println("m1 of parent class");
    }
}
class Ch extends UseTwo
{
    public static void main(String[] args) {
        Ch obj=new Ch();
        obj.m2(); //Parent class
        obj.m3(); //current class becoz use this



    }
    void m1()
    {
        System.out.println("m1 of child  class");
    }
    void m2()
    {
        super.m1();
    }
    void m3()
    {
        this.m1();
    }

}
