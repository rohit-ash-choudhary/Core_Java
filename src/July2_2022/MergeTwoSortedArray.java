package June28_2022;
//Pending Array With this questions
import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of Array");
        int num= sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the len of Array");
        int num1= sc.nextInt();
        int[] arr1=new int[num];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int[] arrr=new int[arr.length+arr1.length];
        int x=0;
        int y=0;
        int i=0;
        while(x<arr.length && y<arr1.length)
        {
            if(arr[x]<arr1[y])
            {
                arrr[i]=arr[x];
                x++;
                i++;
            }
            else {
                arrr[i]=arr1[y];
                y++;
                i++;
            }
        }
        while (x<arr.length)
        {
            arrr[i]=arr[x];
            x++;
            i++;
        }
        while (y<arr1.length)
        {
            arrr[i]=arr1[x];
            y++;
            i++;
        }
        for (int k:arrr
             ) {
            System.out.println(k);
        }
    }
}
