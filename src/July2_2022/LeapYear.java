package June21_2022;

import  java.util.*;
public class LeapYear {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        if(year%400==0 || (year%4==0 && year%100!=0))
        {
            System.out.println("Year is leap");
        }
        else
        {
            System.out.println("Not Leap Year");
        }

    }
}
