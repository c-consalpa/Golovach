package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 * Created by c-consalpa on 7/10/2017.
 */
public class RegExp5 {
    public static void main(String[] args) {
        String s = "ok ok ok ";
        Pattern p = Pattern.compile("[ok]+");
        Matcher m = p.matcher(s);
        m.find();
        System.out.println(m.start());
        System.out.println(m.end());
        m.find();
        System.out.println(m.start());
        System.out.println(m.end());
    }
}
