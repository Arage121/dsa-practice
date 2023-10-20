// to run our customlinkedlist class as linked list and use it's functions
public class Main {
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        for(int i=1; i<10;i++){
            linkedList.insertFirst(i);
        }
        linkedList.insertLast(99);
        linkedList.print();
        linkedList.insertAtAnyIndex(134, 5);
        linkedList.print();
        linkedList.deleteLast();
        linkedList.print();
        linkedList.deleteAtAnyIndex(4);
        linkedList.print();
        linkedList.insertRec(2143421, 5);
        linkedList.print();

//        CustomDoublyLinkedList dll = new CustomDoublyLinkedList();
//        dll.insertFirst(20);
//        dll.insertFirst(23);
//        dll.insertFirst(231);
//        dll.insertLast(2849);
//        dll.insert(20, 100);
//        dll.display();

//          CustomCircularLinkedList cll = new CustomCircularLinkedList();
//          cll.insert(23);
//          cll.insert(231);
//          cll.insert(2552);
//          cll.insert(214123);
//          cll.display();
//          System.out.println();
//          cll.delete(2552);
//          cll.display();
    }
}
