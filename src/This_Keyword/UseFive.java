package This_Keyword;
/*
4. Uses pass as argument in Constructor call
 */
public class UseFive {
    UseFive(Five obj){
        System.out.println("UserFive class constructor ");
    }

}

class Five
{
    public static void main(String[] args) {
        Five obj=new Five();
        obj.m1();
    }
    void m1()
    {
        UseFive obj=new UseFive(this);
    }

}
