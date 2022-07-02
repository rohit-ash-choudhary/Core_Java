package June24_2022;
import java.util.*;
public class BubbleSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        int[] arr=new int[num];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int flag=0;
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }

            }
            if(flag==0)
            {
                break;
            }

        }
        for (int i: arr)
        {
            System.out.println(i);
        }

    }

}
