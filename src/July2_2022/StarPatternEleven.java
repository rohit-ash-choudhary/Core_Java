package June23_2022;
import java.util.*;
public class StarPatternEleven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num= sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <=i; j++) {
                if(i!=j){
                    System.out.print(" ");

                }
                else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}

