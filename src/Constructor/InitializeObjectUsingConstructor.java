package Constructor;

public class InitializeObjectUsingConstructor {
    int emp_id;
    String emp_name;

    InitializeObjectUsingConstructor(int n,String name)
    {
        this.emp_id=n;
        this.emp_name=name;
    }
    public static void main(String[] args) {

        InitializeObjectUsingConstructor obj=new InitializeObjectUsingConstructor(1,"Rohit");
        System.out.println(obj.emp_id);
        System.out.println(obj.emp_name);
        System.out.println(obj);

    }
}
