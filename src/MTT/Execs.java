package MTT;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by c-consalpa on 7/13/2017.
 */
public class Execs {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }

    }
}
