public class CustomStackUsingLinkedList {
    private Node top;

    private class Node{
        private Node next;
        private int data;

        public Node(int data){
          this.data = data;
        }
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public void push(int item){ // insertion at start
        Node temp = new Node(item);
        temp.next = top;
        top = temp;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int peek() throws Exception{
        if(isEmpty()) throw new Exception("Stack is Empty!!");
        return top.data;
    }

    public int pop() throws Exception{ // deletion done at start
        if(isEmpty()) throw new Exception("Stack is Empty!!");
        int removed = top.data;
        top = top.next;
        return removed;
    }

    public void display(){
        if(isEmpty()) return;
        Node temp = top;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("BOTTOM");
    }

}
