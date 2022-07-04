package Inhertance;

public class HierarchicalInheritance {
    public static void main(String[] args) {

    }
    public float div(int a,int b){
        return a/b;
    }
}

class AA extends HierarchicalInheritance
{
    public static void main(String[] args) {

        AA obj=new AA();
        obj.div(3,4);
        obj.mul(3,3);

    }
    public int mul(int a,int b)
    {
        return a*b;
    }
}

class  BB extends  HierarchicalInheritance
{
    public static void main(String[] args) {

        BB obj=new BB();
        obj.div(34,5);
        obj.add(23,5);


    }
    public int add(int a,int b)
    {
        return a+b;
    }
}
