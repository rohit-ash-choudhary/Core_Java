/*
Yes, an overridden method can have a different access modifier but it cannot lower the access scope.

The following rules for inherited methods are enforced -

Methods declared public in a superclass also must be public in all subclasses.
Methods declared protected in a superclass must either be protected or public in subclasses; they cannot be private.
Methods declared private are not inherited at all, so there is no rule for them.
 */
package MethodOverriding;


public class AccessModifierWithOverride{
    public static void main(String[] args) {

    }
    private Object addNum(String a, int b) //Access modifier value is less then child class method access-modifier
    {
        return a+b;
    }
}

class KKKK extends AccessModifierWithOverride
{
    public static void main(String[] args) {

        KKKK obj=new KKKK();
        Object num=obj.addNum("4",7);
        System.out.println(num);
    }

    public String addNum(String a, int b)//her access modifier should be large then parent class method access-modifier
    {
        return a+b;
    }
}
