package heap;

public class HeapExecutor {
    public static void main(String[] args) {
        CustomHeap heap = new CustomHeap();
        heap.insert(99);
        heap.insert(72);
        heap.insert(61);
        heap.insert(58);

        System.out.println(heap.getHeap());

        heap.insert(100);
        System.out.println(heap.getHeap());
    }
}
