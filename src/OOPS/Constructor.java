package OOPS;
// Constructor is used to initializing  the Object
/* 1. block same name as class
   2. not return type used
   3. only public,private,protect and default access modifier
   4. Execute automatically when create a object created

 */

/*
if we not create any constructor compiler automatic create default constructor that used ot assign default value to
variable and used to call superclass constructor
 */

/* as constructor is initializing we can't inherit this */
/* as constructor is initializing its not return anything so there is no return type and also in case
* of default constructor compiler how decide what is return type because return type decide by us  */
public class Constructor {
    String emp_name;
    int emp_id;


    Constructor(String s, int i){
        this.emp_name=s;
        this.emp_id=i;

    }
    public static void main(String[] args) {

        Constructor obj=new Constructor("Rohit",101);
      //  Constructor obj2=new Constructor(); becuase to intilize object use constructor

        System.out.println(obj);
        System.out.println(obj2.emp_name);
        System.out.println(obj2.emp_id);


    }
}
