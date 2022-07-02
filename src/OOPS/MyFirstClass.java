package OOPS;
import java.util.*;
public class MyFirstClass {
    public static void main(String[] args) {
        MyFirstClass obj=new MyFirstClass();
        int n=obj.readInput();
        obj.printInput(n);



    }
    public int readInput()
    {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        return num;

    }
    public void printInput(int n)
    {
        System.out.println(n);
    }
}
