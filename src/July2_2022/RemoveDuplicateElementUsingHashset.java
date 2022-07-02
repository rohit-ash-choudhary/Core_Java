package June28_2022;

import java.util.Scanner;
import java.util.*;
public class RemoveDuplicateElementUsingHashset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of Array");
        int num= sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);

        }
        for (int i: hs
             ) {
            System.out.println(i);
        }
    }
}
