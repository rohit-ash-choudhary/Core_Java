package June28_2022;
import java.util.*;
public class InsertElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of Array");
        int num= sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the index Where the element want to enter");
        int index= sc.nextInt();
        System.out.println("Enter the number you want to add");
        int number=sc.nextInt();
        for (int i = arr.length-1; i>index; i--) {
            arr[i]=arr[i-1];


        }
        arr[index]=number;
        for (int i: arr
             ) {
            System.out.println(i);
        }
    }
}
