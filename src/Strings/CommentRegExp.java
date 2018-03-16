package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by c-consalpa on 7/10/2017.
 */
public class CommentRegExp {
    public static void main(String[] args) {
        // String s = "ab a /*test*/adjiw k\r\n" +
        // "2 line and /* comment again*/ end";
        String s="a /*a*/ sd /*v*/";
        Pattern p = Pattern.compile("(\\/\\*(\\w|\r\n)+\\*\\/)");
        Matcher m = p.matcher(s);
        List<String> l = new ArrayList<>(100);

        while (m.find()) {
            System.out.println("tick");
            l.add(s.substring(m.start()+2, m.end()-2));
        }

        System.out.println(l);
    }
}
