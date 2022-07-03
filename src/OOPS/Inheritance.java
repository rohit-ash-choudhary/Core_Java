package OOPS;

import java.util.Scanner;

/*
   Advantages :
   1.Achieve inheritance using extend keyword
   2. Main achievement is code-reusebility
   3. achieving polymorphising using inhertance
   disAdvantes:
   1. Tightly coupled (for handle use aggregation )

*  */

/* What components not Inherit
 1. Constructor (becoz intializer not part of class)
 2. Private class, private method , private variable
 */

public class Inheritance {
    int emp_name;
    int emp_id;
    public static void main(String[] args) {

        Inheritance obj=new Inheritance();
        System.out.println("Hello");



    }
    public int readInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");
        int num= sc.nextInt();
        return num;
    }

}

 class K extends Inheritance
{
    public static void main(String[] args) {
        K objofb=new K();
        int number=objofb.readInput();

        int printnum=objofb.printOuput(number);
        System.out.println(printnum);

    }
    public int printOuput(int n)
    {
        return n;
    }
}
