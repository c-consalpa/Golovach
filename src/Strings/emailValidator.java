package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by c-consalpa on 7/10/2017.
 */
public class emailValidator {
    public static void main(String[] args) {
        String test = "kalina.bereze1991@mail.ru";
        Pattern p = Pattern.compile("[A-Za-z0-9\\.]+@[a-z]+\\.[a-z]+");
        Matcher m = p.matcher(test);
        System.out.println(m.matches());
    }
}
