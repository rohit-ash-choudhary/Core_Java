package June27_2022;

import java.util.Scanner;

public class FindElementAppeareOneInJava {
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
        int xor=0;
        for(int i = 0; i < arr.length; i++) {
            xor=xor^arr[i];
        }
        System.out.println(xor);
    }
}
