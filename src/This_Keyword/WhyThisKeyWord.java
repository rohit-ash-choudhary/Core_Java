//In Java, this is a reference variable that refers to the current object.
package This_Keyword;

public class WhyThisKeyWord {
    int i;
    public static void main(String[] args) {

    }

    public void setValue(int i)
    {
        i=i; //here both i take as local variable so refer this current class instance variable we use this keyword
       // this.i=i ; //this set i value to current class object  instance varaible
    }

    public int getValue()
    {
        //System.out.println(i);
        return  i;
    }

}
class TestOne
{
    public static void main(String[] args) {
        WhyThisKeyWord obj=new WhyThisKeyWord();
        obj.setValue(10);
        System.out.println(obj.getValue()); //
        System.out.println(obj.i);
    }
}
