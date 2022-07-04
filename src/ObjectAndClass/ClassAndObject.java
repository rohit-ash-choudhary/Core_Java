/* 1.Object is instance of class
   2. Class is blueprint of object
   3. Class doesn't Occupy memory

- Small talk is first truly object-oriented language

Object internalize using
1. Constructor
2. Reference Variable
3. Method

How Create object
1. New keyword
2. New Instance method
3. Clone object
4. using by Deserialization
5. by Factory Method
 */

package ObjectAndClass;

import java.util.Scanner;

public class ClassAndObject {
    String emp_name;
    int emp_id;

    public static void main(String[] args) {


        ClassAndObject obj=new ClassAndObject();  //This is object
        obj.emp_id=1;  //initialization of object
        obj.emp_name="Rohit";

        int number=obj.readInput(); //initialization of object
        System.out.println(obj.printOutput(number));
    }

    public int readInput()   //this is method
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        return num;

    }
    public int printOutput(int n)
    {
        return n;
    }
}
