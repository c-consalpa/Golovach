package MTT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by c-consalpa on 7/13/2017.
 */
public class Fib implements Runnable{
    public static void main(String[] args) {
        l.add(0);
        l.add(1);
        fibonacci(10);
        System.out.println(l);


    }
    static List<Integer> l = new LinkedList<>();
    static int prev=0;
    static int cur=1;



    public static void fibonacci(int n) {
        if (n-2==0) {

            return;
        }
        l.add(cur+prev);
        int tmp = prev;
        prev=cur;
        cur+=tmp;
        fibonacci(n-1);
        }

    @Override
    public void run() {

    }
}

