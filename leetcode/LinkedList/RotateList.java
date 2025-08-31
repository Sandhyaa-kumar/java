public class RotateList {
    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode temp=head,fast=head;
        int l=1;
        while(temp.next!=null)
        {   l++;
           temp=temp.next;
         

        }
        temp.next=head;
        k=k%l;
        int i=1;
        while(i<l-k)
        {
            fast=fast.next;
            i++;
        }
        head= fast.next;
        fast.next=null;
        return head;
    }
}
