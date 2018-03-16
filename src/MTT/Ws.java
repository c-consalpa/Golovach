package MTT;

/**
 * Created by c-consalpa on 7/17/2017.
 */
public class Ws {
    public static void main(String[] args) {
        Thr t = new Thr();
        System.out.println(t.getName());
    }
}


class Thr extends Thread {
    Thr() {
      super();
    }

}
