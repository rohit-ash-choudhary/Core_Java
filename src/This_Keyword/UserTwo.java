package This_Keyword;
/* 2. This keyword is used to invoke current class method (implicity)*/

public class UserTwo {

    void display()
    {
        System.out.println("Hi ");
    }
    void show()
    {
        display(); //if you don't put this compiler automatic put this keyword
    }
    public static void main(String[] args) {
        UserTwo obj=new UserTwo();
        obj.show();

    }
}
