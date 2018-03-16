package IO;

import java.io.*;
import java.util.Arrays;

/**
 * Created by c-consalpa on 5/11/2017.
 */
public class Charsets {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "abcABC123";
        byte[] b = str.getBytes("utf-8");
        int[] arr = {1012,  23, 78456, 97};
        System.out.println(Arrays.toString(b));
        try (
                FileOutputStream fOut = new FileOutputStream("utf32.txt");
                //FileInputStream fIn = new FileInputStream("utf32.txt");
            ) {
            fOut.write((char) arr[0]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
