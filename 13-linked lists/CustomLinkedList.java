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

    public void add(int val){
        if(head == null){
            head = new Node(val);
        }
        Node curr = new Node(val);
        head.next = curr;
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

    public void insertAtAnyIndex(int val, int index){
        if(index == 0) insertFirst(val);
        if(index == size) insertLast(val);
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next; // it will go till index-1 position
        }
        Node node = new Node(val, temp.next); // we will create a new node with value val, and point to it to current temp.next node
        temp.next = node; // and then update temp.next to our newly created node so that our value is inserted at the given index
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
