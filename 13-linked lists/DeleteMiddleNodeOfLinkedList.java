//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
public class DeleteMiddleNodeOfLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteMiddle(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode sp = dummy;
        ListNode fp = dummy;
        while(fp.next!=null && fp.next.next!=null){
            sp = sp.next;
            fp = fp.next.next;
        }
        sp.next = sp.next.next;
        return dummy.next;
    }
}
