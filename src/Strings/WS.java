package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by c-consalpa on 7/10/2017.
 */
public class WS {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("koc");
        String str = "kockoc";
        Matcher m = p.matcher(str);
        System.out.println(m.matches());
        System.out.println(m.find());
        System.out.println(m.find());
        System.out.println(m.find());
        System.out.println(m.find());
        System.out.println(m.find());


    }

}
