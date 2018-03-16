package Collections;

/**
 * Created by c-consalpa on 7/7/2017.
 */
public class finalized {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new ob(i);
        }
    }
}

class ob {
    double[] d;
    int obId;
    ob(int id) {
        d = new double[10000];
        this.obId = id;
    }

    protected void finalize() {
        System.out.println("Removing ob: "+obId);
        this.hashCode();
    }
}
