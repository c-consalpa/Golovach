package Excep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by c-consalpa on 3/13/2017.
 */
public class Main {
public static void main(String[] args) throws IOException {
           try (
                   //FileOutputStream out = new FileOutputStream("t.txt");
                   FileInputStream in = new FileInputStream("t.txt");
                   ) {
               System.out.println((char) in.read());

           }
       }
}

