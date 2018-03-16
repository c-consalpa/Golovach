package Strings;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by c-consalpa on 7/10/2017.
 */
public class FindInFile {
    public static void main(String[] args) {
        try(
                BufferedReader bf = new BufferedReader(new FileReader("rep.txt"));
                ) {
            String line;
            Pattern p = Pattern.compile("a", Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher("");
            int i=0;
            do {
                line = bf.readLine();
                if (line==null) {
                    System.out.println("end of file reached;");
                    return;
                }
                m.reset(line);
                i++;
                System.out.println("Line "+i+": "+line);
                while (m.find()) {
                    System.out.println("Instance \""+m.group()+"\" found at : Line "+i+", Position: "+m.start());
                }
                System.out.println("_______________");
            } while(line!=null);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
