package June21_2022;

import java.util.*;

public class SwapNumber {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int number_fir=sc.nextInt();
        System.out.println("Enter the second number");
        int number_sec=sc.nextInt();
        int third_num=number_fir;
        number_fir=number_sec;
        number_sec=third_num;
        System.out.println("First Number :"+ number_fir); //100
        System.out.println("Seconds Number :"+ number_sec); //200
        System.out.println("Number Swap without using third variable");
        number_sec=number_fir+number_sec; //300
        number_fir=number_sec-number_fir;
        number_sec=number_sec-number_fir;
        System.out.println(number_fir);
        System.out.println(number_sec);

    }
}
