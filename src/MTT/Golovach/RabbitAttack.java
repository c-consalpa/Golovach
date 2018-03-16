package MTT.Golovach;

/**
 * Created by c-consalpa on 7/18/2017.
 */
public class RabbitAttack {
    public static void main(String[] args) {
        new Thread(new Rabbit()).start();
    }
}
class Rabbit implements Runnable {
    private StringBuilder sb=null;
    public String spaces(int i) {
        sb = new StringBuilder("");
        for (int j = 0; j <= i; j++) {
            sb.append(" ");
        }
        return sb.toString();
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
        new Thread(new Rabbit()).start();
            System.out.println(spaces(i)+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}