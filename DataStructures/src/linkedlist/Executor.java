package linkedlist;

public class Executor {
    public static void main(String[] args) {
        CustomLinkedList myLinkedList = new CustomLinkedList(20);
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//        myLinkedList.append(30);
//        myLinkedList.append(40);
//        myLinkedList.prepand(50);
//
//        myLinkedList.setValue(2,60);
//        myLinkedList.insert(2,30);
//        System.out.println(myLinkedList.remove(3));
//        myLinkedList.printList();
//        System.out.println("---------------------");
//        myLinkedList.reverse();
//        myLinkedList.printList();

        DoublyLinkedList list = new DoublyLinkedList(30);
        list.append(40);
        list.removeLast();
        list.prepand(20);
        list.print();
        list.getLength();
    }
}
