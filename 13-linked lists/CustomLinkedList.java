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

    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 1) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
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

    public void bubbleSort(){
        bubbleSort(size-1, 0);
    }

    private void bubbleSort(int row, int col){
        if(row == 0) return;

        if(col < row){
            Node first = get(col);
            Node second = get(col+1);
            if(first.val > second.val){
                //swap
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }else if(second == tail){
                    Node prev = get(col-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }else{
                    Node prev = get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col+1);
        }else{
            bubbleSort(row-1, 0);
        }
    }

    //reverse using recursion
    public void reverseRec(Node node){
        if(node == tail){
            head = tail;
            return;
        }

        reverseRec(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    //reverse using iterative
    public Node reverse(){
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node newNext = curr.next;
            curr.next = prev;

            //move forward
            prev = curr;
            curr = newNext;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        CustomLinkedList c = new CustomLinkedList();
        for(int i=1; i<10;i++){
            c.insertFirst(i);
        }
        c.bubbleSort();
        c.print();
        c.reverse();
        c.print();
    }
}
