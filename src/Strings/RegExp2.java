package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by c-consalpa on 7/7/2017.
 */
public class RegExp2 {
    public static void main(String[] args) {
        String str = "Arline ate eight apples and one orange while Anita hadn’t any";
        Pattern p = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
        Matcher m = p.matcher(str);
        System.out.println(m.matches());

        String str1 = "Evening is full of the linnet’s wings";
        System.out.println(Arrays.toString(str1.split("\\w+")));
    }
}
