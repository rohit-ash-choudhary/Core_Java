package June27_2022;
import java.util.*;
public class LinearSearch {

    public static void main(String[] args) {
        int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of Array");
        int num=sc.nextInt();
        System.out.println("Enter the search number");
        int search_num=sc.nextInt();
        int[] arr=new int[num];
        for (int i = 0; i <arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==search_num)
            {
                temp=1;
                System.out.println("Number is find at index num: "+ i);
            }
        }
        if(temp==0)
        {
            System.out.println("Item is not found");
        }


    }
}
