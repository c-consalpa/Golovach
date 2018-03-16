package MTT;

/**
 * Created by c-consalpa on 7/17/2017.
 */
public class MyRunnable {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("run()");
            }
        };
        r.run();
    }
}
