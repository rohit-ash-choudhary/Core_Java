package This_Keyword;
/*
4. Uses pass as argument in method call
 */
public class UseFour {
    public static void main(String[] args) {
        UseFour obj=new UseFour();
        obj.m2();
    }
    void m1(UseFour obj)
    {
        System.out.println("in the m1 method");
    }
    void m2()
    {
        m1(this);
        System.out.println("in the m2 method");
    }
}
