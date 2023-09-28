//https://leetcode.com/problems/linked-list-cycle/
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode sp = head;
        ListNode fp = head;
        while(fp!=null && fp.next!=null){
            sp = sp.next;
            fp = fp.next.next;

            if(sp == fp) return true; // there is only way to find a cycle i.e they will meet at some point
        }
        return false;
    }
}
