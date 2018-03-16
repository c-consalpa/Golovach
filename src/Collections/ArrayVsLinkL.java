package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.currentTimeMillis;

/**
 * Created by c-consalpa on 7/5/2017.
 */


public class ArrayVsLinkL {
    public static void main(String[] args) {
        new Object().equals(args);
        final int LIST_LENGTH = 100_000;
        final int OPERATIONS = 100_000;
        int elemIndex = LIST_LENGTH/2;
        List<Integer> t = new LinkedList<>();

        List<String> arrL = new ArrayList<>();
        List<String> arrL1 = new ArrayList<>();
        arrL1.add("a");
        System.out.println(arrL1.contains(new String("a")));
        List<String> LinkL = new LinkedList<>();

        for (int i = 0; i < LIST_LENGTH; i++) {
            arrL.add("A");
            LinkL.add("B");
        }

        long start = currentTimeMillis();
//        for (int i = 0; i < OPERATIONS; i++) {
//            arrL.get(elemIndex);
//        }
        long end = currentTimeMillis();
        System.out.println(end-start);
    }
}
