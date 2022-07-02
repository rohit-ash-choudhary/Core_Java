package June24_2022;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int[] arr=new int[num];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min])
                {
                    min=j;

                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
        for (int i:arr
             ) {
            System.out.println(i);
        }
    }
}
