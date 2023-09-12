// to run our customlinkedlist class as linked list and use it's functions
public class Main {
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        for(int i=1; i<10;i++){
            linkedList.insertFirst(i);
        }
        linkedList.print();
    }
}
