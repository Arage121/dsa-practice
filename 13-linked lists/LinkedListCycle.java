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
    public boolean hasCycle(ListNode head) { // to find cycle in linked list
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

    public int lengthOfCycle(ListNode head){
        if(head == null) return 0;
        ListNode sp = head;
        ListNode fp = head;
        while(fp!=null && fp.next!=null){
            sp = sp.next;
            fp = fp.next.next;

            if(sp == fp) {
                int length = 0;
                ListNode temp = sp;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != fp); //this will run till the temp(sp) is again not equal to fp and it calculates the length of the cycle only
                return length;
            }
        }
        return 0;
    }
}
