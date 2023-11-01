//https://leetcode.com/problems/reorder-list/
public class ReorderList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode mid = findMiddle(head);

        ListNode head1 = head;
        ListNode head2 = reverse(mid);// we will reverse the second half and then we will get have two heads we will rearrange it according to the pattern


        while(head1!=null && head2!=null){
            ListNode temp = head1.next;
            head1.next = head2;
            head1 = temp;

            temp = head2.next;
            head2.next = head1;
            head2 = temp;
        }
        if(head1!=null) head1.next = null; // this should be pointing to null only then only it will know that linkedlist is not circular
    }

    public ListNode findMiddle(ListNode head){
        ListNode fp = head;
        ListNode sp = head;

        while(fp!=null && fp.next!=null){
            sp = sp.next;
            fp = fp.next.next;
        }
        return sp;
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode Next = null;
        while(curr!=null){
            Next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = Next;
        }
        return prev;
    }
}
