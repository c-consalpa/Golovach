package OOP._23;

/**
 * Created by c-consalpa on 3/2/2018.
 */
public class Anonym {
    public static void main(String[] args) {
        X x = new X();
        Runnable r = x.f();
        r.run();
    }
}

class X {
    int k = 1;

    Runnable f() {
        int p = 2;

        return new Runnable() {
            @Override
            public void run() {
                System.out.println(p * k);
            }
        };
    }
}