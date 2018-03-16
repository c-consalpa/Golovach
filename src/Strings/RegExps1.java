package Strings;

/**
 * Created by c-consalpa on 7/6/2017.
 */
public class RegExps1 {
    public static void main(String[] args) {
        String str = "+123";
        System.out.println(str.matches("\\+\\d+"));
    }
}
