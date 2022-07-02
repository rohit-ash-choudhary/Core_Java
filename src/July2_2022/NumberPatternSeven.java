package June23_2022;
import java.util.*;
public class NumberPatternSeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int number=1;
        for (int i = 1; i <=num; i++) {

            for (int j = 1; j <= i; j++) {
                number+=j;

                System.out.print(number);
                number+=1;



            }
            System.out.println();

            
        }
    }
}
