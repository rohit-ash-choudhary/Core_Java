/*
 link : 1. https://www.javamadesoeasy.com/2015/06/differences-between-instance.html#:~:text=static%20blocks%20executes%20when%20class,be%20used%20in%20instance%20block.

2. https://study.com/academy/lesson/static-block-vs-constructor-in-java.html#:~:text=In%20a%20Java%20class%2C%20a,the%20class%20at%20run%2Dtime.

Static blocks:
  static{
  }


1. static blocks executes when class is loaded in java.
2. instance block executes only when instance of class is created, not called when class is loaded in java.

1. Static block automatic called when loaded in memory
2. Before 1.6 version you can call or print something without main Method but from Java 1.7 its compulsory
declare main Method.
3. Always static method execute before main even declare anywhere before main method or after main method
4. Yes you can multiple static block in class
5. execution of multiple static block is Top - Button



What is Uses of static Method & What we write in static block:

1. We write that code in static block which we want to execute at class loaded time like Native method
2. To initialize static member (static variable )

What is native method : Code that create in other language

Oder of calling
Static block > Main Method >Instace block  > Constructor





 */





package Static_Keyword;

public class StaticBlock {

    //Non-static /Instance block
    {
        System.out.println("I am in Instance block 1 ");
    }

    StaticBlock() //Constructor
    {
        System.out.println("I am In Constructor");
    }

    static { //Static block
        System.out.println("I am in static block 1");
    }

    public static void main(String[] args) {
        System.out.println("I am in Main Method");
        new StaticBlock();
    }

    static {
        System.out.println("I am in static block 2");
    }

    //Non-static /Instance block
    {
        System.out.println("I am in Instance block 2");
    }
}
