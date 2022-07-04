package Inhertance;

public class MultiLevelInheritance {
    public static void main(String[] args) {

    }
    public int add(int a,int b)
    {
        return a+b;
    }

}


class VV extends MultiLevelInheritance{
    public static void main(String[] args) {

    }

    public int mul(int a,int b)
    {
        return a*b;
    }

}

class YY extends VV
{
    public static void main(String[] args) {

        YY obj=new YY();
        obj.add(4,5);
    }
    public float div(int a,int b){
        return a/b;
    }
}
