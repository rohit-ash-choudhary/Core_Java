package June27_2022;
import java.util.*;
public class LinearSaerchString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int num=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the string want to search");
        String str=sc.nextLine();
        String[] arr=new String[num];
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextLine();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str))
            {
                temp=1;
                System.out.println("The string parsemt at this index  "+ i);
            }

        }
        if(temp==0)
        {
            System.out.println("Enter string is not avaible");
        }

    }
}
