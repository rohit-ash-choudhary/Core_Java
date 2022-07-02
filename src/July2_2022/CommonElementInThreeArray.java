package June28_2022;
import java.util.*;
public class CommonElementInThreeArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of Array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the len of Array");
        int num1=sc.nextInt();
        int[] arr1=new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the len of Array");
        int num2=sc.nextInt();
        int[] arr2=new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=sc.nextInt();
        }
        int x=0;
        int y=0;
        int z=0;
        while (x<arr.length && y<arr1.length && z<arr2.length)
        {
            if(arr[x]==arr1[y] && arr1[y]==arr2[z]) {
                arrlist.add(arr[x]);
                x++;
                y++;
                z++;
            } else if (arr[x]<arr1[y]) {
                x++;
            } else if (arr1[y]<arr2[z]) {
                y++;

            }
            else {
                z++;
            }
        }
        for (int i: arrlist
             ) {
            System.out.println(i);
        }
    }
}
