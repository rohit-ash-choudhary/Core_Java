package Inhertance;
import java.util.*;
public class SingleLevelInheritance {
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

class XX extends SingleLevelInheritance {
    public static void main(String[] args) {

        XX obj=new XX();
        obj.add(4,5);

    }
    public float div(int a,int b){
        return a/b;
    }
}
