package June27_2022;
import java.util.*;
public class MaxMinValueInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the elements of array");
        for (int i = 0; i <num ; i++) {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for (int i =1; i < arr.length; i++) {
            if (arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }

        }
        System.out.println("minnum "+ min);
        System.out.println("maxmum  "+ max);
    }
}
