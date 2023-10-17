public class ReverseLinkedListII {
     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode preLeft = dummy; // so that we can change its next directly as the next will be containing the reversed part
        ListNode curr = head;
        for(int i=1;i<left;i++){
            preLeft = preLeft.next;
            curr = curr.next;
        }

        ListNode sublistHead = curr; // because at last we have to make its next connect to the last remaining nodes(after the reversed ones)
        ListNode prev = null;
        for(int i=0;i<=right-left;i++){ // this will run right-left+1 times
            ListNode newNext = curr.next;
            curr.next = prev;

            prev = curr;
            curr = newNext;
        }

        preLeft.next = prev;
        sublistHead.next = curr;
        return dummy.next;
    }
}
