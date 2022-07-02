package June27_2022;
import java.util.*;
public class FindSecondMaxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int[] arr=new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int s_max=Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            {
                s_max=max;
                max=arr[i];
            } else if (arr[i]>s_max && arr[i]!=max) {
                s_max=arr[i];

            }

        }
        System.out.println(s_max);
    }
}
