package June24_2022;
import java.util.*;
public class DiffWayToPrintArrayElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element of Array");
        int len=sc.nextInt();
        int[] arr=new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Print Element By For Loop");
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }
        System.out.println("Print Elements by ForEach Loops");
        for (int a: arr)
        {
            System.out.println(a);
        }
        System.out.println("Print Elements by While  Loops");
        int i=0;
        while (i<arr.length)
        {
            System.out.println(arr[i]);
            i++;
        }
        System.out.println("Print Elements by Do-While Loops");
        int j=0;
        do {
            System.out.println(arr[j]);
            j++;
        }
        while (j<arr.length);
    }
}
