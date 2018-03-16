package MTT;

/**
 * Created by c-consalpa on 7/14/2017.
 */
public class Threads1 {
    public static void main(String[] args) {
        Thread t = new Thread(new myTask());
        t.start();
        Thread t1 = new Thread(new myTask());


    }
}

class myTask implements Runnable {


    @Override
    public void run() {
        System.out.println("myTask processing in thread: "+Thread.currentThread());
    }
}
