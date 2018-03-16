package Strings;

/**
 * Created by c-consalpa on 7/6/2017.
 */
public class formatters {
    public static void main(String[] args) {
        final int W = 30;
        int i = 5;
        double d = 5.55;
        float f = 1.6F;
        String s = "test";

        System.out.format("%1$-"+W+"s%2$-"+W+"s%3$-"+W+"s\n","Name", "Double", "Float");
        System.out.format("%4$-"+W+"s%2$-"+W+".2f%3$-"+W+".1f\n",i,d,f,s);
        System.out.printf("c: %c\n", 's');



    }
}
