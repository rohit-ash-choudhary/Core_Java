package July2_2022;

import java.util.*;
public class MaxMinEl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int arr_len=sc.nextByte();
        int[] arr=new int[arr_len];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        int min=arr[0];
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }
        System.out.println("Max Element : "+ max);
        System.out.println("Min Element : "+ min);
    }
}
