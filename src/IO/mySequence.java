package IO;

import java.util.Arrays;

/**
 * Created by c-consalpa on 6/5/2017.
 */
public class mySequence {
    public static void main(String[] args) {

        String res = altPairs("ThisThatTheOther");
        System.out.println(res);
    }

    public static String altPairs(String str) {
        char[] arr = str.toCharArray();
        char seqNums[] = new char[arr.length];

        for (int i = 0; i < arr.length; i = i+4) {
            seqNums[i]=arr[i];
            if (i != arr.length-1 || i != arr.length-1){
                seqNums[i+1] = arr[i+1];
            }

        }
        String res="";
        for (int i = 0; i < seqNums.length; i++) {
            if ((int) seqNums[i] > 0) {
                res+=seqNums[i];
            }


        }
        return res;
    }

}
