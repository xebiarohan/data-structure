package sortings;

public class BubbleSort {
    public static void main(String[] args) {

    }

    public static void sort(int[] array) {
        for(int i = array.length-1;i > 0;i--) {
            for(int j=0;j<i;j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void sort_new(int[] array) {
        for(int i = 1;i < array.length-1;i++) {
            for(int j=0;j<array.length-i;j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
