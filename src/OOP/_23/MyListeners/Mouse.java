package OOP._23.MyListeners;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by c-consalpa on 3/16/2018.
 */
public class Mouse {
    public Mouse() {
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }

    private void mouseClick(int newX, int newY) {
    }

    private List<MouseListener> listeners = new ArrayList<>();

     public void addListener(MouseListener listener) {
         this.listeners.add(listener);
     }

     public void mouseMove(int newX, int newY) {

     }
}
