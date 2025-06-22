package heap;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    private List<Integer> heap;

    public MinHeap() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value) {
        heap.add(value);
        int index = heap.size()-1;
        int parentIndex = parent(index);
        while (index > 0 && heap.get(parentIndex) > heap.get(index)) {
            swap(index,parentIndex);
            index = parentIndex;
            parentIndex = parent(index);
        }
    }

    private void sinkDown(int index) {
        while (true) {
            int minIndex = index;
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);
            if(leftIndex < heap.size() && heap.get(leftIndex) < heap.get(index)) {
                minIndex = leftIndex;
            }

            if(rightIndex < heap.size() && heap.get(rightIndex) < heap.get(index)) {
                minIndex = rightIndex;
            }

            if(minIndex != index) {
                swap(index, minIndex);
                index = minIndex;
            } else {
                return;
            }
        }
    }

    public Integer remove() {
        if(heap.isEmpty()) {
            return null;
        } else if(heap.size() == 1) {
            return heap.remove(0);
        } else {
            int minValue = heap.get(0);
            heap.set(0,heap.get(heap.size()-1));
            heap.remove(heap.size()-1);
            sinkDown(0);
            return minValue;
        }
    }

}