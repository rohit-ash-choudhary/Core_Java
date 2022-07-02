package June23_2022;
import java.util.*;
public class NumberPatternEights {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int number=1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(number);
                number+=1;
            }
            System.out.println();
            
        }
    }
}
