package June22_2022;
import  java.util.*;
public class FibcooniSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght for Fib Series");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        if (num == 2) {
            System.out.println(a);
            System.out.println(b);

        } else {
            System.out.println(a);

            System.out.println(b);
            for (int i = 2; i < num; i++) {

                int c = a + b; //1,2,3
                System.out.println(c); //1,2,3
                a = b; //1,1,2
                b = c; //1,2,3

            }
        }
    }

}
