package Excep;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by c-consalpa on 3/16/2017.
 */
public class _1 {
    public static void main(String[] args) throws MyException {
    try {
        throw new RuntimeException("err");
    } catch (Exception e) {


        throw new RuntimeException(e);
    }
    }

}
