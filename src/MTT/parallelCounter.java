package MTT;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created by c-consalpa on 7/14/2017.
 */
public class parallelCounter {
    public static final int N = 100000000;
    public static int j = 0;
    public static void inc() {
        for (int i = 0; i < N; i++) {
            j++;
        }
        System.out.println(j); // 1000000
    }
}

class parallelCounterDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                parallelCounter.inc();
            }
        });
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(parallelCounter.j); // 0 Why?
    }
}