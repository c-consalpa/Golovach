package MTT;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by c-consalpa on 7/17/2017.
 */
public class ExceptionThread implements Runnable {
    public void run() {
        throw new RuntimeException();
    }
    public static void main(String[] args) {
        try {
            ExecutorService exec = Executors.newCachedThreadPool();
            exec.execute(new ExceptionThread());
        } catch (Exception e) {

        }
    }
}
