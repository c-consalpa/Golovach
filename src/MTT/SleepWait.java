package MTT;

/**
 * Created by c-consalpa on 7/31/2017.
 */
public class SleepWait {
    public static void main(String[] args) {
        SleepWaitDemo sl = new SleepWaitDemo();
        Thread t1 = new Thread(sl);
        Thread t2 = new Thread(sl);

        t1.start();
        t2.start();

    }
}

class SleepWaitDemo implements Runnable {
    private synchronized void f() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" Init");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" after sleep");
        System.out.println(Thread.currentThread().getName()+" before wait");
        this.wait(5000);
        System.out.println(Thread.currentThread().getName()+" after wait");

    }
    @Override
    public void run() {
        try {
            f();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
