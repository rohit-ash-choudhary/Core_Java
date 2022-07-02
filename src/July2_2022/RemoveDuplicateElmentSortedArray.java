package June28_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateElmentSortedArray {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the len of Array");
            int num= sc.nextInt();
            int[] arr=new int[num];
            System.out.println("Enter the elements of Array");
            for (int i = 0; i < arr.length; i++) {
                arr[i]= sc.nextInt();
            }
           /* System.out.println("Using Extra ArrayList");
            ArrayList<Integer> arlst=new ArrayList<>();
            for (int i = 0; i < arr.length-1; i++) {   //Using Extra Memory Using Arraylist
                if(arr[i]==arr[i+1])
                {
                    continue;
                }
                else{
                    arlst.add(arr[i]);
                }

            }
            arlst.add(arr[arr.length-1]);
            for (int i:
                    arlst) {
                System.out.println(i);
            }*/
            System.out.println("Using One Array");
            int j=0;
            for (int i = 0; i <arr.length-1; i++) {
                if(arr[i]!=arr[i+1])
                {
                    arr[j]=arr[i];

                    j++;
                }

            }
            arr[j]=arr[arr.length-1];

            for (int i = 0; i < j+1; i++) {
                System.out.println(arr[i]);
            }
        }
    }


