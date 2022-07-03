package OOPS;

public class HereticalInheritance {

    public int addNum(int a,int b)
    {
        return a+b;
    }
}
class BB extends HereticalInheritance
{
    public static void main(String[] args) {
        BB obj=new BB();
        System.out.println(obj.addNum(3,5));
    }

}

class cc extends HereticalInheritance
{
    public static void main(String[] args) {
        cc obj=new cc();
        System.out.println(obj.addNum(4,5));

    }
}
