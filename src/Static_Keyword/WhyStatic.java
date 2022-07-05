/*
the keyword static means that the particular member belongs to a type itself, rather than to aninstance
of that type.
This means we'll create only one instance of that static member that is shared across all instances of
the class.

---------------------------Static Field ------------------------------------------------------
when we declare a field static, exactly a single copy of that field is created and shared among
all instances of that class.
It doesn't matter how many times we initialize a class. There will always be only one copy of static
field belonging to it. The value of this static field will be shared across all objects of either
the same or any different class.
From the memory perspective, static variables are stored in the heap memory.

----Compelling Reasons to Use static Fields
When the value of the variable is independent of objects
When the value is supposed to be shared across all objects
------ Key Points to Remember
Since static variables belong to a class, we can access them directly using class name. So, we don't need
any object reference.
We can only declare static variables at the class level.
We can access static fields without object initialization.
Finally, we can access static fields using an object reference (such as ford.numberOfCars++). But we
should avoid this because it becomes difficult to figure out if it’s an instance variable or a class
variable. Instead, we should always refer to static variables using class name (Car.numberOfCars++).

------he static Methods (Or Class Methods)-----------------------------
Similar to static fields, static methods also belong to a class instead of the object. So, we can call
them without creating the object of the class in which they reside.
------Compelling Reasons to Use static Methods
To access/manipulate static variables and other static methods that don't depend upon objects
static methods are widely used in utility and helper classes.

---------A static Block--------------------------------------------------
We use a static block to initialize static variables. Although we can initialize static variables directly
during declaration, there are situations when we need to do the multiline processing.

In such cases, static blocks come in handy.

If static variables require additional, multi-statement logic during initialization, we can use a static block.

---Compelling Reasons to Use static Blocks
If the initialization of static variables needs some additional logic except the assignment
If the initialization of static variables is error-prone and needs exception handling
---Key Points to Remember
A class can have multiple static blocks.
static fields and static blocks are resolved and run in the same order as they are present in the class.
----------------------------------A static Class----------------------------
Java programming language allows us to create a class within a class. It provides a compelling way of
grouping elements that we'll only use in one place. This helps to keep our code more organized and
readable.

The nested class architecture is divided into two:
Nested classes that we declare static are called static nested classes.
Nested classes that are non-static are called inner classes.
The main difference between these two is that the inner classes have access to all members of the
enclosing class (including private), whereas the static nested classes only have access to static members
of the outer class.

In fact, static nested classes behave exactly like any other top-level class but are enclosed in the only
class that will access it, to provide better packaging convenience.
---------Compelling Reasons to Use a static Inner Class
Grouping classes that will be used only in one place increases encapsulation.
We bring the code closer to the only place that will use it. This increases readability, and code is more maintainable.
If a nested class doesn't require any access to its enclosing class instance members, it's better to
 declare it as static. This way, it won't be coupled to the outer class and is therefore more optimal,
  as they won't require any heap or stack memory.
------------- Key Points to Remember
static nested classes do not have access to any instance members of the enclosing outer class. It can only access them through an object's reference.
static nested classes can access all static members of the enclosing class, including private ones.
Java programming specification doesn't allow us to declare the top-level class as static. Only classes
within the classes (nested classes) can be made as static.
6.1. Example of static Class
 */
package Static_Keyword;

public class WhyStatic {
}
