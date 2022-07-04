package Constructor;
/*
Why use the parameterized constructor?
        The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.
*/
public class ParametrizedConstructor {
    int emp_id;
    String emp_name;
    ParametrizedConstructor(int i,String name)
    {
        this.emp_id=i;
        this.emp_name=name;
    }
    public static void main(String[] args) {


        ParametrizedConstructor obj=new ParametrizedConstructor(1,"RRR");
        System.out.println(obj.emp_id);
        System.out.println(obj.emp_name);

    }
}
