package June21_2022;

public class Third_Variable {
    // Static variable is class level variable
    static String name="Rohit Choudhary";
    public static void main(String[] args) {

        System.out.println(name);
        System.out.println(Third_Variable.name);
        System.out.println(new Third_Variable().name);

    }
}
