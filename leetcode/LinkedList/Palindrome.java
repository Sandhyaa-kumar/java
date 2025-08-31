public class Palindrome {
public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
    public static ListNode reverse( ListNode head)
    {
         ListNode prev=null;
        while(head!=null)
        {
             ListNode next=head.next;
             head.next=prev;
             prev=head;
             head=next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast!=null&&fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
         ListNode secondhalf = reverse(slow);
         while(secondhalf!=null)
         {
            if(head.val!=secondhalf.val) return false;
            secondhalf=secondhalf.next;
            head=head.next;
         }
         return true;
    }
}

