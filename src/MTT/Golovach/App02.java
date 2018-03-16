package MTT.Golovach;

/**
 * Created by c-consalpa on 7/17/2017.
 */
public class App02 {
    public static void main(String[] args) throws InterruptedException {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                sillyWork();
//                System.out.println("T");
//            }
//        }).start();

        for (int i = 0; i < 5000; i++) {
            sillyWork();
            System.out.println("bye");
        }
    }

    private static void sillyWork() {
        double d = 2.0;
        for (int i = 0; i < 15_000_000; i++) {
            d = Math.sin(d);
        }
    }
}


