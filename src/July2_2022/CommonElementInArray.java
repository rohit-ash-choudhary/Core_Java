package June27_2022;
import java.util.*;
public class CommonElementInArray {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of first array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the len of Seconds array");
        int num2=sc.nextInt();

        int[] arr2=new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if(arr[i]==arr2[j])
                {
                    hs.add(arr[i]);
                    break;
                }

            }
        }
        for (int i:hs
             ) {
            System.out.println(i);
        }
    }
}
