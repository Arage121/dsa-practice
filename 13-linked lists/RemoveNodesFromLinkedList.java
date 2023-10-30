//https://leetcode.com/problems/remove-nodes-from-linked-list/
public class RemoveNodesFromLinkedList { // understand the logic , if u're not able to understand then DRY code
       public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);

        ListNode max = head;
        ListNode temp = head.next;
        while(temp != null){
            if(max.val > temp.val){
                max.next = temp.next;
            }else{
                max = temp;
            }
            temp = temp.next;
        }
        return reverse(head);
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode Next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = Next;
        }
        return prev;
    }
}
