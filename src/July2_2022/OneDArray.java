package June24_2022;
import java.util.*;
public class OneDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len=sc.nextInt();
        int[] arr=new  int[len];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the elemnet of Array");
            arr[i]=sc.nextInt();

        }
        for (int i:arr) {
            System.out.println(i);

        }

    }
}
