package June23_2022;
import java.util.*;
public class NumberPatternFive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
                
            }
            for (int j = i; j >0 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
