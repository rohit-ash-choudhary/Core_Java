package TwoD_Array;
/*
Identify Primary Daignol Element :
         i==j
Identify Primary Daignol Element :
        i+j=n-1
 */
import java.util.Scanner;

public class PrimaryAndSecDiagnol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns");
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j)
                {
                    System.out.println("Primary Daignol Element : "+arr[i][j]);
                }
                if(i+j==n-1){
                    System.out.println("Secondy Daignol Element : "+arr[i][j]);
                }
            }
        }
    }
}
