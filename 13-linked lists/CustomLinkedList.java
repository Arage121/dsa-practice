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
