package June23_2022;
import java.util.*;
public class NumberPatternThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int number=1;
        for (int i = 1; i <num; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(number);
                number+=1;
            }
            System.out.println();
        }
    }
}
