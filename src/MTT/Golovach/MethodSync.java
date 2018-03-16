package MTT.Golovach;

/**
 * Created by c-consalpa on 7/28/2017.
 */
public class MethodSync {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
            hello(1);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
            hello(2);
            }
        });
        t1.start();
        t2.start();
    }
public static synchronized void hello(int id) {
    System.out.println(id+ " Hello");

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {

    }
}
}


