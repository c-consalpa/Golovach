package DDS;

import java.util.Arrays;

/**
 * Created by c-consalpa on 2/2/2017.
 */
public class arrRec {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int cntr = 0;
        showRec(arr, cntr);
        System.out.println("loop  finished");


    }
    public static void showRec(int[] arr, int counter) {
        System.out.println("calling recursion with: c = "+counter);
        System.out.println(arr[counter]);
        if (counter < arr.length-1) {
            showRec(arr, ++counter);
        }


    }
}
