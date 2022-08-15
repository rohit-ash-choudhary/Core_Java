/*
Link : 1. https://www.javatpoint.com/exception-handling-in-java
       2. https://www.geeksforgeeks.org/exceptions-in-java/#:~:text=Java%20Exception%20Handling%20is%20a,flow%20of%20the%20program's%20instructions.

Exception:
Exception is an unwanted or unexpected event, which occurs during the execution of a program,
i.e. at run time, that disrupts the normal flow of the program's instructions.

Exceptions can be caught and handled by the program. When an exception occurs within a method,
it creates an object. This object is called the exception object. It contains information about the
exception, such as the name and description of the exception and the state of the program when the
exception occurred.

Major reasons why an exception Occurs
1.Invalid user input
2.Device failure
3.Loss of network connection
4.Physical limitations (out of disk memory)
5.Code errors
6. Opening an unavailable file

Exception Handling:

The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors
so that the normal flow of the application can be maintained.


 */

package Exception;

public class WhatIsException {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6/0);
        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Exception.WhatIsException.main(WhatIsException.java:40)

         */
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);


    }
}
