//https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
public class MaxTwinSumOfALinkedList {
     public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

    public int pairSum(ListNode head) {

        ListNode slow = head,fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverse(slow);


        int max = Integer.MIN_VALUE;

        while(slow != null){
            max = Math.max(max,slow.val+head.val);
            head = head.next;
            slow = slow.next;
        }
        return max;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null,curr = head;

        while(curr != null){
            ListNode newNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newNext;
        }

        head = prev;
        return head;
    }
}
