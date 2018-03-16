package MTT;

import java.io.IOException;

/**
 * Created by c-consalpa on 7/17/2017.
 */
class ResponsiveUI extends Thread {
    public volatile double d = 0;
    public ResponsiveUI(String responsiveThreadName) {
        System.out.println("responsiveUi started");
        setDaemon(true);
        start();
    }
    public void run() {
        while (true) {
            try {

                sleep(1000);
                d = d+1;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class DemoUI {
    public static void main(String[] args) throws IOException {
        ResponsiveUI RUI = new ResponsiveUI("ResponsiveThread");
        System.in.read();
        System.out.println(RUI.d);
        System.out.println("main closed;");
    }
}