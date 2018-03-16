package MTT.EvenCheck;

/**
 * Created by c-consalpa on 7/21/2017.
 */
public class parallelUpdate {
    public static void main(String[] args) {
        Operator op = new Operator();
        new Thread(op).start();
        new Thread(op).start();


    }
}


class Operator implements Runnable {
    @Override
    public void run() {
        f();
    }

    private synchronized void f() {
        for (int i = 0; i < 5; i++) {
            s+=i;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(s);
    }

    String s = "";
}