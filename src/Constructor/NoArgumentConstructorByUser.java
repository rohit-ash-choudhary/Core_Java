/*
    When a user create constructor but not provide any argument to this is called no argument constructor
    created by user
    Once a constructor is declared private, it cannot be accessed from outside the class. So, creating objects from outside the class is prohibited using the private constructor.

    Here, we are creating the object inside the same class. Hence, the program is able to access the constructor. To learn more, visit Java Implement Private Constructor.

    However, if we want to create objects outside the class, then we need to declare the constructor as public.
    like below
    Private NoArgumentConstructorByUser()
    {

    }
    public NoArgumentConstructorByUser()
    {

    }

 */

package Constructor;
import java.util.*;
public class NoArgumentConstructorByUser {
}
