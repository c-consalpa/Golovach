package MTT;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by c-consalpa on 7/13/2017.
 */
class Cbl implements Callable {
    private int n;

    public Cbl(int n) {
        this.n = n;
    }

    @Override
    public Object call() throws Exception {
        return "string"+n;
    }
}

class CblDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        Future<String> f = exec.submit(new Cbl(5));
        exec.shutdown();
        System.out.println(f.isDone());
    }
}