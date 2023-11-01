//https://leetcode.com/problems/reverse-nodes-in-k-group/
public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) { // used recursion
        if(head == null);
        ListNode curr = head;
        ListNode prev = null, Next = null;
        int c = k;
        while(curr != null && c > 0){
            Next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = Next;
            c--; // reversed k elements
        }

        if(curr == null && c > 0){
            curr = prev;
            prev = null;
            Next = null;

            while(curr != null){
                Next = curr.next;
                curr.next = prev;

                prev = curr;
                curr = Next;
            }
        }

        if(c > 0){ // this indicates that like k=3, then only 7,8 elements were reversed because it should have been become 0 if k=3 grouping was there because we are doing c--;
            return prev;
        }else{
            head.next = reverseKGroup(curr, k); //this will only happen if whole linked list should be reversed k times i.e grouping otherwise we will again reverse the last remaining elements so that they will look like they have been left out
        }

        return prev;
    }
}
