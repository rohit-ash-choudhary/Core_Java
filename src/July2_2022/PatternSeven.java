package June22_2022;
import java.util.*;
public class PatternSeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        for (int i =1; i <=num; i++) {
            for (int j = 1; j <=num-i; j++) {
                System.out.print(" ");
            }
            for (int j = num-i; j <num; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
