//https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1
class Node {
    int data;
    Node next;
    Node(int value) {
        this.data = value;
    }

}
public class ReverseLinkedList {
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        Node newNext = null;
        Node curr = head;
        Node prev = null;

        while(curr != null){
            newNext = curr.next; // Store the next node
            curr.next = prev; // Reverse the pointer of the current node

            // Move to the next nodes
            prev = curr;
            curr = newNext;
        }

        return prev;
    }
}
