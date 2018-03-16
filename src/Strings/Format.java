package Strings;

public class Format {
    public static void main(String[] args) {
        int i = 5;
        double d = 5.55;
        float f = 1.6F;
        String s = "test";

        System.out.format("%1$-10s%2$-10s%3$-10s\n","Name", "Double", "Float");
        System.out.format("%4$-10s%2$-10.2f%3$-10.1f",i,d,f,s);


    }
}