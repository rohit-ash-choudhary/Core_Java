package June22_2022;
import  java.util.*;
public class PrimeOrNot {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number= sc.nextInt();
        int flag=0;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if(number%i==0)
            {
                System.out.println("Number is not Prime");
                flag=1;
                break;
            }

        }
        if(flag==0)
        {
            System.out.println("Number is prime");
        }
    }
}
