package heap;

public class HeapExecutor {
    public static void main(String[] args) {
        CustomHeap heap = new CustomHeap();
        heap.insert(92);
        heap.insert(75);
        heap.insert(80);
        heap.insert(55);
        heap.insert(60);
        heap.insert(50);
        heap.insert(65);

        System.out.println(heap.getHeap());

        heap.remove();
        System.out.println(heap.getHeap());

        heap.remove();
        System.out.println(heap.getHeap());
    }

}
