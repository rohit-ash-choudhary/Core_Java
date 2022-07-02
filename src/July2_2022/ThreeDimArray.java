package June24_2022;
import java.util.*;
public class ThreeDimArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the r1");
        int r1=sc.nextInt();
        System.out.println("Enter the r2");
        int r2=sc.nextInt();
        System.out.println("Enter the r3");
        int r3=sc.nextInt();
        int[][][] array=new int[r1][r2][r3];
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++) {

                for (int k = 0; k < array[i][j].length; k++) {

                    array[i][j][k]=sc.nextInt();

                }

            }
        }
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++) {

                for (int k = 0; k < array[i][j].length; k++) {

                    System.out.println(array[i][j][k]);

                }

            }
        }

    }
}
