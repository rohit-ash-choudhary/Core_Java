package June27_2022;

import java.util.Scanner;

public class EvenOdd {
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
        int even_total=0;
        int odd_total=0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0)
            {
                even_total+=arr[i];
            }
            else{
                odd_total+=arr[i];
            }

        }
        System.out.println(even_total);
        System.out.println(odd_total);
    }
}
