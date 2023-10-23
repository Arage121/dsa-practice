public class SortList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid = findMiddle(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return mergeLinkedLists(left, right);
    }

    public ListNode mergeLinkedLists(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(head1!=null && head2!=null){
            if(head1.val < head2.val){
                curr.next = head1;
                head1 = head1.next;
            }else{
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }

        if(head1!=null){
            curr.next = head1;
        }else{
            curr.next = head2; 
        }
        return dummy.next;
    }

    public ListNode findMiddle(ListNode head){
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
