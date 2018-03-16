package MTT;

/**
 * Created by c-consalpa on 7/13/2017.
 */
public class Exc1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Test");
        Thread.yield();
        System.out.println("Test");
        Thread.yield();
        System.out.println("dwq");
        Thread.yield();
        System.out.println("Test");
        Thread.yield();
        return;
    }
}
