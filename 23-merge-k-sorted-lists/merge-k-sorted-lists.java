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
    public ListNode mergeKLists(ListNode[] lists) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(ListNode arr:lists){
            while(arr!=null){
                int val=arr.val;
                if(val>max) max=val;
                if(val<min) min=val;
                arr=arr.next;
            }
        }
        ListNode[] table=new ListNode[max-min+1];
        for(int i=lists.length-1;i>=0;i--){
            ListNode node=lists[i],temp;
            while(node!=null){
                temp=node.next;
                node.next=table[node.val-min];
                table[node.val-min]=node;
                node=temp;
            }
        }
        ListNode ans=new ListNode();
        ListNode p=ans;
        for(ListNode node: table){
            if(node!=null) {
                p.next=node;
                p=p.next;
                while(node.next!=null) node=node.next;
                p=node;
            }
        }
        return ans.next;
    }
}