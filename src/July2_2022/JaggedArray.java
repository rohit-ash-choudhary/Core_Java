package June24_2022;
import java.util.*;
public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        int[][] arr = new int[row][];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number of colums");
            int col = sc.nextInt();
            arr[i] = new int[col];

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the number");
                arr[i][j] = sc.nextInt();

            }
        }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.println(arr[i][j]);

                }

            }


        }
    }

