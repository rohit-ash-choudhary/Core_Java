package June21_2022;

public class Variable_One {
    //Local Variable
    int first_number=34;
    int second_number=23;
    int third_number;
    public static void main(String[] args)
    {
        Variable_One var=new Variable_One();
        int num_add=var.add(var.first_number, var.second_number);
        int num_mul=var.mul(var.third_number, var.first_number);
        System.out.println(num_add);
        System.out.println(num_mul);

    }
    public int add(int num1,int num2)
    {
        int four_number=12;
        return four_number+num1+num2;
    }
    public int mul(int num3,int num4)
    {
        int fiv_num=10;
        // int six_num; /*local variable have not defualt  value */
        // return fiv_num*four_number*num3*num4 /* wrong becoz local have inside block scope */
        return fiv_num*num3*num4;
    }
}
