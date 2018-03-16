package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by c-consalpa on 7/6/2017.
 */
class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{x= "+x+", y = "+y+"}";
    }
}

class main {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Set l = new HashSet();
        l.add("test");
        System.out.println(l.hashCode());

    }
}
