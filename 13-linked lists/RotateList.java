//https://leetcode.com/problems/rotate-list/
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k <= 0 || head.next == null) return head;

        int length = getLength(head);
        k = k % length;
        // Draw the diagram and solve it on paper, u will get to know how we solve this
        ListNode temp = head;
        for(int i=0;i<length-k-1;i++){
            temp = temp.next;
        }

        ListNode last = findTail(head);
        last.next = head;
        head = temp.next;
        temp.next = null;

        return head;
    }

    public ListNode findTail(ListNode head){
        ListNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        return temp;
    }

    public int getLength(ListNode head){
        ListNode curr = head;
        int length = 0;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        return length;
    }
}
