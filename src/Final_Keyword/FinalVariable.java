
/*
1) Java final variable
If you make any variable as final, you cannot change the value of final variable(It will be constant).

 */
package Final_Keyword;
public class FinalVariable {
    final static int num=34;

    public static void main(String[] args) {
       // num=2324; --- java: cannot assign a value to final variable num
        FinalVariable obj=new FinalVariable();
        System.out.println(obj.num);
    }
}
