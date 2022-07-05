package This_Keyword;
/*
       This keyword used to invoke current class instance variable
*/
public class UsesOne {
    int k;
    public static void main(String[] args) {
        UsesOne obj=new UsesOne();
        obj.show();
        System.out.println(obj.k);


    }
    public void show()
    {
        int k;
        k=10;
        this.k=34;
        System.out.println(k);

    }
}
