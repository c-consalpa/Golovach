package Strings;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by c-consalpa on 7/10/2017.
 */
public class RegExp3 {
    public static void main(String[] args) {
        //String sent = "Java now has regular expressions";
        String sent = "Java now has regular expressions";

        Pattern p = Pattern.compile("s{4}");
        Matcher m = p.matcher(sent);
        boolean str = m.lookingAt();
        System.out.println(str);
//        String test ="";
//        Boolean b = Pattern.matches("[A-Za-z\\s]+", sent);
//        System.out.println(b);
//        System.out.println(sent.replaceAll("[aeiouy]", "_"));

    }
}
