package June21_2022;

public class DataType {
    boolean val=true; /*1bit decied at run time by jvm */
    String name="Rohit";// Char 2 btyes
    int age=23; // 4 btyes
   /* Short protein=3.3; //2 bytes */
    long phone_number=7618883; //bytes
    float weight=65.4f; //4 bytes
    double bank_balace=34434.44;


    public static void main(String[] args){
        DataType obj=new DataType(); //We need to create object becoz in static method we can't direct use instance variable
        System.out.println(obj.val);
        System.out.println(obj.name);
        System.out.println(obj.age);
      //  System.out.println(obj.protein);
        System.out.println(obj.phone_number);
        System.out.println(obj.weight);
        System.out.println(obj.bank_balace);


    }
}
