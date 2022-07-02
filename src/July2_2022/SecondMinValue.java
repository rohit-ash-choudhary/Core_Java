package June27_2022;
import java.util.*;
public class SecondMinValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of Array");
        int num=sc.nextInt();
        System.out.println("Enter the elment of Array");
        int[] arr=new int[num];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int s_min=Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
            {
                s_min=min;
                min=arr[i];
            }
            else if(arr[i]<s_min && arr[i]!=min){
                s_min=arr[i];

            }
        }
        System.out.println(s_min);
    }
}
