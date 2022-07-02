package June28_2022;
import java.util.*;
public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of Array");
        int num= sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element want to remove");
        int number= sc.nextInt();
        for(int i = 0; i < arr.length-1; i++) {

                if(arr[i]==number)
                {
                    for (int j = i; j < arr.length-1; j++) {
                        arr[j]=arr[j+1];
                    }
                    break;
                }

        }
        for (int i: arr
             ) {
            System.out.println(i);
        }

    }
}
