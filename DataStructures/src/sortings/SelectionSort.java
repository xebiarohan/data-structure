package sortings;

public class SelectionSort {
    public static void main(String[] args) {

    }

    public static void sort(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            int minIndex = i;
            for(int j = i+1;j < arr.length;j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if(i != minIndex) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
