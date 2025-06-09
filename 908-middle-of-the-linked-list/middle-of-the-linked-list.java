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
    public ListNode middleNode(ListNode head) {
        int len=0;
        ListNode temp = head;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        temp=head;

        int count =len/2;
        while(count!=0){
            temp=temp.next;
            count--;
        }
        if(len%2!=0)return temp.next;
        else return temp;
    }
}