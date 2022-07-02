package June23_2022;
import java.util.*;
public class StarPatternTwele {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        for (int i = num; i >0; i--) {
            for (int j = 0; j <=num; j++) {
                if(i==j)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
