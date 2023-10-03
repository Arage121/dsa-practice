public class CustomDoublyLinkedList {
    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) head.prev = node;
        head = node;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next; //at the end of loop it will be at last node position
        }

        last.next = node;
        node.prev = last;

    }

    public void display(){
        Node curr = head;
        Node last = null;
        while(curr != null){
            System.out.print(curr.val + " -> ");
            last = curr;
            curr = curr.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while(last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.print("START");
    }
    private class Node{
        private int val;
        private Node next;
        private Node prev;
        Node(int val){
            this.val = val;
        }
        Node(int val, Node head, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
