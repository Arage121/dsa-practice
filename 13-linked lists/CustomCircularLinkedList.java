public class CustomCircularLinkedList { // this is a circular linked list i.e it has loop and it will go infinite if u don't give the condition node!=head as last node next will be head
    private Node head;
    private Node tail;

    public CustomCircularLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node node = head;
        if(head!=null){
            do{
                System.out.print(node.val+" -> ");
                if(node.next!=null) node = node.next;
            }while(node!=head);
        }
        System.out.println("HEAD");
    }

    public void delete(int val){
        Node node = head;
        if(node == null) return;
        if(node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            if(node.next.val == val){
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }while(node!=head);
    }

    public class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }
}
