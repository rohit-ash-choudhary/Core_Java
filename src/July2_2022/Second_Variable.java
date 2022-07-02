package June21_2022;

public class Second_Variable {
    //Instance Variable
    int num1=34;
    int num2=12;
    public static void main(String[] args) {
        Second_Variable obj=new Second_Variable();
        System.out.println(obj.num1+obj.num2);
        obj.prin();
    }
    public void prin()
    {
        System.out.println(num1);
    }
}
