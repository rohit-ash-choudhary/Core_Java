package June22_2022;
import java.util.*;
public class StarPatternFour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        for (int i = 1; i<=num; i++) {
            for (int j =0 ; j <num-i; j++) {
                System.out.print(" ");
            }
            for (int j = num-i; j<num ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
