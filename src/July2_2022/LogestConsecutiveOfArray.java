package June28_2022;
import java.util.*;
public class LogestConsecutiveOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        HashSet <Integer> hs=new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        int logest_len=0;
        for (int i = 0; i < arr.length; i++) {

            if(hs.contains(arr[i]-1)) //0
            {
                int no=arr[i];
                        while(hs.contains(no)) //1,2,3,4,5
                        {
                            no++;
                        }
                        if(logest_len<no-arr[i])
                        {
                            logest_len=no-arr[i];
                        }
            }
        }
        System.out.println(logest_len+1);
    }
}
