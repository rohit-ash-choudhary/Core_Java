package June22_2022;
import java.util.*;
public class StarPatternThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        for (int i = 0; i < num ; i++) {
            for (int j = 0; j<=i; j++) {

                System.out.print ("* ");

            }
            System.out.println();

        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num-i; j++) {
                System.out.print ("* ");

            }
            System.out.println();
        }

    }
}
