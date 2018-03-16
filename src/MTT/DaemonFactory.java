package MTT;

import java.util.concurrent.*;

/**
 * Created by c-consalpa on 7/14/2017.
 */
public class DaemonFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        t.setName("DaemonThread");
        System.out.println("startin thread: "+t.getName());
        try {
            t.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return t;
    }
}

class OrdThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        System.out.println("startin thread: "+t.getName());
        try {
            t.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return t;
    }
}

class myRun implements Runnable {

    @Override
    public void run() {
        System.out.println("Starting MyRun in ");
    }
}

class DaemDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool(new DaemonFactory());
        ExecutorService exec1 = Executors.newCachedThreadPool(new OrdThreadFactory());
        exec.execute(new myRun());
        exec1.execute(new myRun());


        exec.shutdown();

    }
}