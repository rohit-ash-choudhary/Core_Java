package June27_2022;
import java.util.*;
public class BinarySearchInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the number you want to search");
        int srch_num=sc.nextInt();
        int low_i=0;
        int high_i=arr.length-1;
        while(low_i<high_i)
        {
            int mid=(low_i+high_i)/2;
            if(arr[mid]==srch_num)
            {
                System.out.println("Element find at index "+ mid);
                break;
            } else if (srch_num>arr[mid])
            {
                low_i=mid+1;
            }
            else{
                high_i=mid+1;
            }
        }

    }
}
