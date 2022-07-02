package June24_2022;
import java.util.*;
public class AnonmouysArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(AnonmouysArray.sum(new int[]{1,2,3,4}));

    }
    static int sum(int[] no)
    {
        int total_sum=0;
        for (int i:no) {
            total_sum+=i;

        }
        return total_sum;
    }
}
