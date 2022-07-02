package June21_2022;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        sc.nextLine();
        String name=sc.next();
        sc.nextLine();
        String address=sc.nextLine();
        System.out.println(name);
        System.out.println(address);
    }
}
