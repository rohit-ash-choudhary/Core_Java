package June21_2022;
import java.util.*;
public class Calender {
    static int third_number;
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Symbol");
        String sy= sc.next();
        System.out.println("Enter the first_number");
        int f_num=sc.nextInt();
        System.out.println("Second Number");
        int s_num=sc.nextInt();

        switch (sy)
        {
            case "+" : third_number=f_num+s_num;
                System.out.println(third_number);
                break;
            case "-" : third_number=f_num-s_num;
                System.out.println(third_number);
                break;
            case "*" : third_number=f_num*s_num;
                System.out.println(third_number);
                break;
            case "/" : third_number=f_num/s_num;
                System.out.println(third_number);
                break;


        }

    }
}
