public class CustomLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedList(){ // top class constructor
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }
    private class Node{
        private int val;
        private Node next;

        private Node(int val){ // inner class constructor
            this.val = val;
        }

        private Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
