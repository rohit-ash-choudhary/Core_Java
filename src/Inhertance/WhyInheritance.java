package Inhertance;

public class WhyInheritance {
    public static void main(String[] args) {

    }

    public int add(int a,int b)
    {
        return a+b;
    }
    public int mul(int a,int b)
    {
        return a*b;
    }


}

class DD
{
    public static void main(String[] args) {

        DD obj=new DD();
        obj.div(4,5);
        //obj.mul(5,6)
        /*  here I am not able to this method using DD class object so if we want use
        other class method in class then you need to create object of that class
        here, or we need to inheritance that particular class
         */

        WhyInheritance obj2=new WhyInheritance();
        obj2.add(4,6);

    }
    public float div(int a,int b){
        return a/b;
    }
}


