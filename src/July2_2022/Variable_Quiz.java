package June21_2022;

public class Variable_Quiz {
    int num=34;
    static int num2=342;
    public  static void main(String[] args)
    {
        Variable_Quiz obj=new Variable_Quiz();
        System.out.println(obj.num); //34
        System.out.println(num2); //342
        obj.num=43;
        num2=23;
        System.out.println(obj.num); //43
        System.out.println(num2); //23
        Variable_Quiz obj2=new Variable_Quiz();
        System.out.println(obj2.num);  //34
        System.out.println(num2); //23
    }
}
