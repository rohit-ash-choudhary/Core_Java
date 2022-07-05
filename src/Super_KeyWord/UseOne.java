package Super_KeyWord;
/*
1.super can be used to refer immediate parent class instance variable.
 */
public class UseOne {
    int kk=34;
}

class Aa extends UseOne
{
    public static void main(String[] args) {
        Aa obj=new Aa();
        obj.show(100);

    }
    void show(int kk)
    {
        System.out.println(kk);
        System.out.println(super.kk);
    }
}
