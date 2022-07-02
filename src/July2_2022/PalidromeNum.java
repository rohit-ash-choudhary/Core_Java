package June22_2022;
import  java.util.*;
public class PalidromeNum {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int str_num=num;
        int rev=0;
        int rem=0;
        while (num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }

        if(str_num==rev)
        {

            System.out.println("Number is palidrome");
        }
        else{
            System.out.println("Number is not palidrome");
        }
    }
}
