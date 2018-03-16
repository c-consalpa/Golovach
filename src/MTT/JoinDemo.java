package MTT;

public class JoinDemo {
    public static void main(String[] args) {
        Sleeper1 t1 = new Sleeper1("T1");
        Sleeper2 t3 = new Sleeper2("T2", t1);

    }
}

class Sleeper1 extends Thread {
    Sleeper1(String n) {
        super(n);
        start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread()+" "+i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Sleeper2 extends Thread {
    private Sleeper1 slp1;

    Sleeper2(String n, Sleeper1 s) {
        super(n);
        slp1 = s;
        start();
    }

    public void run() {
        try {
            slp1.join();
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread() + " " + i);
                sleep(100);
                if(i==5) interrupt();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}