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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)return null;
        int len = 1;
        ListNode temp=head;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        temp=head;
        // if(len%2!=0) len=(len/2)-1;
        len=(len/2)-1;
        while(len>0){
            temp=temp.next;
            len--;
        }
        temp.next=temp.next.next;
        return head;

        // -------------Slow and Fast pointer-------
        // if(head.next==null) return null;
        // ListNode slow =head;
        // ListNode fast =head;
        // ListNode prev=head;
        // while(fast!=null && fast.next!=null){
        //     prev=slow;
        //     slow=slow.next;
        //     fast=fast.next.next;
        // }
        // prev.next=slow.next;
        // return head;

    }
}