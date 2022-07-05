/*
Static Method :
        1. if you create method with static keyword then its called static method
        2. Static method you can direct call through class not need to create object
        3. Static method used to memory management not need create object direct call through class
           So save memory.
        4. Static method only access data,can't access non-static data
        5. Static method can call only other static method and can't call a non-static method
        6. Static method can't refer super() and this() keyword in anyway



----If you apply static keyword with any method, it is known as static method.
1.A static method belongs to the class rather than the object of a class.
2.A static method can be invoked without the need for creating an instance of a class.
3. A static method can access static data member and can change the value of it.
 */

package Static_Keyword;

class AZ
{
    public static void main(String[] args) {
        AZ obj=new AZ();
        obj.show();

    }
    void show()
    {
        StaticMethod.display();  //You can call direct through class name
        System.out.println("You are in show method");
    }
}
public class StaticMethod
{
    int i;
    public static void main(String[] args) {

    }
    static void display()
    {
        /* System.out.println(i);  this line give error becoz not access direct non-static data
            you need to create object (new StaticMethod().i)

         */
        /*mul(); // this line give error becoz static method call only static method not call non-static method */
        add(); //run successsfully because add is static method
        System.out.println("you are in static display method");
    }
    void mul()
    {
        System.out.println(5*5);
    }
    static void add()
    {
        System.out.println(5*5);
      //  System.out.println(this.i);
        //  given error becoz this() & super() not allowed with static method
    }


}
