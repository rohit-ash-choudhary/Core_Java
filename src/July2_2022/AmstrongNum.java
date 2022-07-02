package June22_2022;
import java.util.*;

public class AmstrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int num=0;
        int str_num=number;
        int number_ams=number;
        while (number>0)
        {
            number=number/10;
            num+=1;
        }
        int rem=0;
        int total_num=0;
        while(str_num>0)
        {
            rem=str_num%10;
            int mul=1;
            for (int i=0;i<num;i++){
            mul*=rem;}
            total_num+=mul;
            str_num=str_num/10;
        }
        System.out.println(total_num);
        System.out.println(number_ams);
        if(number_ams==total_num)
        {
            System.out.println("Amstrong Number");
        }
        else{
            System.out.println("Not Amstrong Number");
        }
    }
}
