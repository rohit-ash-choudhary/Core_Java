package June27_2022;

import java.util.Scanner;

public class FirstDuplicate {
    public static void main(String[] args) {
        int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the element of Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {   //BruteForce
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]) {
                    System.out.println(arr[i]);
                    temp++;
                    break;
                }
            }
            if(temp>0)
            {
                break;
            }

        }

    }
}
