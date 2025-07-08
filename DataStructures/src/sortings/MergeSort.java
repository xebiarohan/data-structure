package sortings;

import java.util.Arrays;

public class MergeSort {

    public static int[] sort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }
        int midIndex = arr.length/2;
        int[] left = sort(Arrays.copyOfRange(arr,0, midIndex));
        int[] right = sort(Arrays.copyOfRange(arr, midIndex, arr.length));

        return merge(left, right);
    }


    public static int[] merge(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k=0;

        int[] mergedArray = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        if(j < arr2.length) {
            for(int a = j; j< arr2.length;j++) {
                mergedArray[k] = arr2[a];
                k++;
            }
        }

        if(i < arr1.length) {
            for (int a = i; i< arr1.length;i++) {
                mergedArray[k] = arr1[a];
                k++;
            }
        }

        return mergedArray;
    }
}
