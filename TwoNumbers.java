/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode aadi=new ListNode(0);
        ListNode l3=aadi;
        int carry=0;
        while(l1!=null || l2!=null){
            int l1_val=(l1!=null)?l1.val : 0;
            int l2_val=(l2!=null)?l2.val:0;
            int sum_val=l1_val+l2_val+carry;
            carry=sum_val/10;
            int lastdig=sum_val%10;
            ListNode newnode=new ListNode(lastdig);
            l3.next=newnode;
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
            l3=l3.next;
        }
        if(carry>0)
        {
            ListNode newnode=new ListNode(carry);
            l3.next=newnode;
            l3=l3.next;
        }
        return aadi.next;
    }
}
