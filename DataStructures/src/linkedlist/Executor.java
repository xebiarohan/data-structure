package linkedlist;

public class Executor {
    public static void main(String[] args) {
        CustomLinkedList myLinkedList = new CustomLinkedList(20);
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
        myLinkedList.append(30);
        myLinkedList.append(40);
        System.out.println("Value is:" + myLinkedList.removeLast().value);


        myLinkedList.prepand(50);
        myLinkedList.printList();
    }
}
