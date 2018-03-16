package Proc;

import java.util.Arrays;

/**
 * Created by c-consalpa on 1/13/2017.
 */
public class AllPossibleArrayVariants {
    public static void main(String[] args) {
    int[] arr = {1,2,3};
    permute(arr, arr.length);

    }

    static void permute(int[] arr, int size) {

    if (size<2) {
        System.out.println(Arrays.toString(arr));
    } else {
        for (int i = 0; i < size; i++) {
            swap(arr, i, size-1);
            permute(arr, size-1);
        }
    }

    }

    static void swap(int arr[], int j, int k) {
        int tmp;
        tmp = arr[j];
        arr[j] = arr[k];
        arr[k] = tmp;

    }

}
