public class CustomLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedList(){ // top class constructor
        this.size = 0;
    }

    public void print(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("end");
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

    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if(head == null) tail = null;
        size--;
        return val;
    }

    public void insertLast(int val){
    if(tail == null){
        insertFirst(val);
        return; // exit from here don't execute the below lines
    }
    Node node = new Node(val);
    tail.next = node;
    tail = node;
    size++;
    }

    public int deleteLast(){
        if(size <= 1) return deleteFirst();
        Node secondLast = get(size-2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    //we have to use this function for deleting lastnode in linked list and update tail, we will point to second last node and use it for the required output
    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next; // it will go till index-1 position which will be size-2 for deletelast func
        }
        return node;
    }

    public void insertAtAnyIndex(int val, int index){
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next; // it will go till index-1 position
        }
        Node node = new Node(val, temp.next); // we will create a new node with value val, and point to it to current temp.next node
        temp.next = node; // and then update temp.next to our newly created node so that our value is inserted at the given index
        size++;
    }

    public int deleteAtAnyIndex(int index){
        if(index == 0) deleteFirst();
        if(index == size-1) deleteLast();
        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        size--;
        return val;
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
