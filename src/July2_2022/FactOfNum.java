package June21_2022;
import java.util.*;

public class FactOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        int fact=1;
        for (int i = 1; i <num+1 ; i++) {
            fact*=i;
        }
        System.out.println(fact);
    }
}
