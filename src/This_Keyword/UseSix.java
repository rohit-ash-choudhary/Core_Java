package This_Keyword;
/*
6. used to return current instance  from the method

//Doubt : What is real meaning of instance
 */
public class UseSix {
    UseSix m1()
    {
        return this;
    }
    public static void main(String[] args) {
        UseSix obj=new UseSix();
        obj.m1();
    }
}
