package July2_2022;

public class VariableType {

    String name="Rohit"; //2bytesfor char
    int age=23; //4 bytes
    float weight=56.5f; //4bytes
    long phone_no=7611988883l; //8bytes
    double protein=3434.23244d; //8bytes
    //short=2bytes 1 bytes=8bit
    char Gender='M';

    public static void main(String[] args) {
        System.out.println(new VariableType().name );
        System.out.println(new VariableType().age );
        System.out.println(new VariableType().weight);
        System.out.println(new VariableType().phone_no);
        System.out.println(new VariableType().phone_no);
        System.out.println(new VariableType().Gender);

    }
}
