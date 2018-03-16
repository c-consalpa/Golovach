package Strings;

/**
 * Created by c-consalpa on 7/6/2017.
 */
public class toStringFormat {
    private static Object ob;
    public toStringFormat(Object ob) {
        this.ob = ob;
    }

    @Override
    public String toString() {
        return String.format("Double: %1$-10f ;",ob);
    }
}

class main{
    public static void main(String[] args) {

        toStringFormat t = new toStringFormat(56.12);
        System.out.println(t.toString());

     }
}
