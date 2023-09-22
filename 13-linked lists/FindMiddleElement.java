//https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
public class FindMiddleElement {
    private class Node{
        Node head;
        Node next;
        int data;
        Node(int val){
            data = val;
            next = null;
        }
    }
    int getMiddle(Node head) // using two pointer approach
    {
        if(head == null){
            return -1;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next; // when the fast will reach end, slow will be at middle
        }
        return slow.data;
    }
}