//https://leetcode.com/problems/palindrome-linked-list/
public class LinkedListPalindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        ListNode Next = null;
        while(fast!=null && fast.next!=null){ // idea is that when fast will reach or at null, slow will be pointing at middle+1 node and we had already been reversed the half linked list on the way, now we will simply with the help of slow and prev pointers compare them till they go to null e.g 1<-2. 2->1  it will be like this now we will compare values and we can easilty they are plaindrome or not
            fast = fast.next.next;
            Next = slow.next;
            slow.next = prev;

            prev = slow;
            slow = Next;
        }

        if(fast!=null){
            slow = slow.next; // skip the middle element in odd linkedlist i.e fast will be at last but not on null
        }

        while(prev!=null && slow!=null){
            if(prev.val != slow.val){
                return false;
            }
            prev = prev.next;
            slow = slow.next;
        }
        return true;
    }
}
