package June27_2022;

import java.util.Scanner;

public class MissingElementInArray {
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int num=sc.nextInt();
            int[] arr=new int[num];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
            }
            int total=((arr.length+1)*(arr.length+2))/2; //Also Using XOR Less complexity
            int sum_arr=0;
            for(int i = 0; i < arr.length; i++) {

                sum_arr+=arr[i];
            }
        System.out.println(total-sum_arr);
    }
}
