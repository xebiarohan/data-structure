package sortings;

public class InsertionSort {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];
            int j = i-1;
            while (j >=0 && currentValue < arr[j]) {
                arr[j+1] = arr[j];
                arr[j] = currentValue;
                j--;
            }
        }
    }
}
