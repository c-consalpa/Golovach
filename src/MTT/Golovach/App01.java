package MTT.Golovach;

/**
 * Created by c-consalpa on 7/17/2017.
 */
public class App01 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("run();");
            }
        };
        Thread t1 = new Thread(r);
        t1.start();
    }
}
