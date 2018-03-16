package MTT.EvenCheck;

/**
 * Created by c-consalpa on 7/21/2017.
 */
public class ImproperState {
    public static void main(String[] args) {
        ImproperStateDemo im = new ImproperStateDemo();
        new Thread(im, "T1").start();
        new Thread(im, "T2").start();

    }
}

class ImproperStateDemo implements Runnable {
static int i = 5;
    private void longProc(){
        System.out.println("In proc "+Thread.currentThread().getName()+", i="+i);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i+=5;

        System.out.println("out proc "+Thread.currentThread().getName()+", i="+i);

    }
    @Override
    public void run() {
        longProc();
    }
}
