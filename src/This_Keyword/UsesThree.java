package This_Keyword;
/*
3. Used to invoke current class Constructor
 */
public class UsesThree {

    UsesThree()
    {
        System.out.println("No Agrument Constructor");
    }
    UsesThree(int a)
    {
        this();
        System.out.println("Parameterized Constructor");

    }

    public static void main(String[] args) {
        UsesThree obj=new UsesThree(4);

    }
}
