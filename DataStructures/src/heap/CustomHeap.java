package heap;

import java.util.ArrayList;
import java.util.List;

public class CustomHeap {
    private List<Integer> heap;

    public CustomHeap() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    public int getLeftChild(int index) {
        return 2*index + 1;
    }

    public int getRightChild(int index) {
        return 2*index + 2;
    }

    public int getParent(int index) {
        return (index-1)/2;
    }

    public void  swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value) {
        heap.add(value);
        int index = heap.size()-1;
        int parentIndex = getParent(index);
        while (index > 0 && heap.get(parentIndex) < heap.get(index)) {
            swap(index,parentIndex);
            index = parentIndex;
            parentIndex = getParent(index);
        }
    }

    public Integer remove() {
       if(heap.isEmpty()) {
           return null;
       } else if(heap.size() == 1) {
           return heap.remove(0);
       } else {
           int maxValue = heap.get(0);
           heap.set(0, heap.remove(heap.size()-1));
           sinkDown(0);
           return maxValue;
       }
    }

    public void sinkDown(int index) {
        while (true) {
            int maxIndex = index;
            int leftChild = getLeftChild(index);
            int rightChild = getRightChild(index);
            if(leftChild < heap.size() && heap.get(leftChild) > heap.get(maxIndex)) {
                maxIndex = leftChild;
            }

            if(rightChild < heap.size() && heap.get(rightChild) > heap.get(maxIndex)) {
                maxIndex = rightChild;
            }

            if(maxIndex != index) {
                swap(index,maxIndex);
                index = maxIndex;
            } else {
                return;
            }
        }
    }

}
