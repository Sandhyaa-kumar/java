public class Reorder {
 public class ListNode {
     int val;
     ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    public static ListNode reverse(ListNode head)
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
    public void reorderList(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
      ListNode half=reverse(slow.next);
      slow.next=null;
      ListNode first=head,second=half;
      while(second!=null)
      {
        ListNode t1=first.next;
        ListNode t2 = second.next;
        first.next=second;
        second.next=t1;
        first=t1;
        second=t2;
      }
    }
}

