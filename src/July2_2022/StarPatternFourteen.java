package June23_2022;
import java.util.*;
public class StarPatternFourteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if((i>1 && i<5) && (j>1 && j<5))
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(" *");
                }

            }
            System.out.println();
        }
    }
}
