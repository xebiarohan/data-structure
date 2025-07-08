package sortings;

import java.util.Arrays;

public class SortingExecutor {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 5, 1, 3};
       // SelectionSort.sort(arr);s
       // BubbleSort.sort_new(arr);
       // InsertionSort.sort(arr);
       // System.out.println(Arrays.toString(arr));

        int[] sortedArray = MergeSort.sort(arr);
        System.out.println(Arrays.toString(sortedArray));
    }
}
