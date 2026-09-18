/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode curr = node.next;
        ListNode pre = node;

        while(curr.next!=null){
            pre.val = curr.val;
            curr=curr.next;
            pre = pre.next;
        }
        pre.val = curr.val;
        pre.next = null;

        
        
    }
}