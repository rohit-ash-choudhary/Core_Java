package OOPS;

import java.util.Scanner;

public class MultiLevelInheritance {


    public int add(int a,int b)
    {
        return a+b;
    }
}
class B extends MultiLevelInheritance
{
    public int mul(int a,int b)
    {
        return a*b;
    }
}
class C extends B
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the fnum");
        int a=sc.nextInt();
        System.out.println("Enter the snum");
        int b=sc.nextInt();
        C obj=new C();
        System.out.println(obj.add(a,b));
        System.out.println(obj.mul(a,b));

    }

}