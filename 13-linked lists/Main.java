// to run our customlinkedlist class as linked list and use it's functions
public class Main {
    public static void main(String[] args) {
//        CustomLinkedList linkedList = new CustomLinkedList();
//        for(int i=1; i<10;i++){
//            linkedList.insertFirst(i);
//        }
//        linkedList.insertLast(99);
//        linkedList.print();
//        linkedList.insertAtAnyIndex(134, 5);
//        linkedList.print();
//        linkedList.deleteLast();
//        linkedList.print();
//        linkedList.deleteAtAnyIndex(4);
//        linkedList.print();

        CustomDoublyLinkedList dll = new CustomDoublyLinkedList();
        dll.insertFirst(20);
        dll.insertFirst(23);
        dll.insertFirst(231);
        dll.insertLast(2849);
        dll.display();
    }
}
