public class InsertInASortedList {
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    Node sortedInsert(Node head1, int key) {
        Node node = new Node(key);

        if(head1==null || key<head1.data){
            node.next = head1;
            return node;
        }

        Node curr = head1;
        while(curr.next!=null && curr.next.data<=key){
            curr = curr.next;
        }

        node.next = curr.next;
        curr.next = node;

        return head1;
    }
}
