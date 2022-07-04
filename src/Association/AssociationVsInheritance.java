/*
Inheritance:

One class can use features from another class to extend its functionality.
Inheritance based on IS-A Relationship.  Inheritance is uni-directional. Inheritance is indicated by a solid line with a arrowhead pointing at the super class.
Example:
1. House is a Building. But Building is not a House.
2.  A Car is a Automobile.
3. A Cat is a Animal.

Pro of Inheritance:
1. Code reliability
2. Cost-cutting //No need to written method again and again
3. Reduce redundancy

Cons:
1. Tightly coupled


Association :
association is a relation between two separate classes which establishes through their Objects.
Association can be one-to-one, one-to-many, many-to-one, many-to-many. In Object-Oriented programming,
an Object communicates to another object to use functionality and services provided by that object.
 Composition and Aggregation are the two forms of association.

 Note: In Inheritance we extend the class so they tightly coupld
        but In association we create object of one class into other class
 */

package Association;

import java.util.Scanner;
class Bank
{
    private String bank_namee;
    Bank(String s)
    {
        this.bank_namee=s;
    }
    public static void main(String[] args) {

    }



    public String printBankName()
    {
        return  this.bank_namee;
    }
}

class Employee
{

    private String emp_namee;
    Employee(String name)
    {
        this.emp_namee=name;
    }
    public static void main(String[] args) {

    }


    public String printEmpName()
    {
        return  this.emp_namee;
    }
}
public class AssociationVsInheritance {
    public static void main(String[] args) {

        Bank obj_bnk=new Bank("AXIS");
        Employee obj_emp=new Employee("ABC");
        System.out.println(obj_bnk.printBankName() +"   "  + obj_emp.printEmpName());

    }



}

