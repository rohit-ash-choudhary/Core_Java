/*
--- Note : Necessary to provide defination(ovveride) the abstract method in child class in interface & use
pulic in accesss modifier when declare defination


Once you implement an interface from a concrete class you need to provide implementation to
 all its methods. If you try to skip implementing methods of an interface at compile time an
  error would be generated.
 */

package MethodOverriding;
import java.util.*;


interface Add
{
    abstract int add();
}
public class InterfaceVsOverride implements Add {
    public static void main(String[] args) {

    }

    public int add()
    {
        System.out.println("child class method ");
        return 0;
    }
}
