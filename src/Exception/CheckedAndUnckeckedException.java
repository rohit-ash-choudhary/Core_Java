/*
Link :
1. https://rollbar.com/blog/how-to-handle-checked-unchecked-exceptions-in-java/
2. https://www.theserverside.com/answer/What-are-checked-vs-unchecked-exceptions-in-Java
3. https://www.baeldung.com/java-checked-unchecked-exceptions


Compile Time Exception(Checked Exception ) Vs RuntimeException(Checked ):

Note : All exception are occurred at runtime no exception is occurred at compile time
this Error message show at compile time indicates that in future this exception is comes so please correct
this but that exception is occurs at compile time

Even we can't correct exception just report using TRY-CATCH later this program is running fine

Till you can't hande the compile time exception your program can't compile successfully


Compile Time Exception(Checked Exception ) Vs RuntimeException(Checked ):

Compile Time Exception(Checked Exception ) :
Compile Time Exception(Checked Exception ) are exception that compiler can check at compile time
RuntimeException(Checked ):
RuntimeException(Checked) are the exception that compiler able can't check  (or compiler ignore)

 */

package Exception;
import java.io.FileInputStream;


public class CheckedAndUnckeckedException {
    public static void main(String[] args)  {

              System.out.println(100/0); //compiler can't check at compile time is called checked exception

        try {

            FileInputStream obj = new FileInputStream("c/abc.text"); //This is Checked exception

        /*
        In compile time just indicates may be this exception will occure
        java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown
         */
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
