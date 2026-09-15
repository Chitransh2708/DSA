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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode count1 = head;
        int count =0;
        ListNode preLeft = null;
        ListNode curr = head;
        ListNode right = head;
        int pos1 = 1;
        int pos2 = 1;

        while(count1!=null){
            count1 = count1.next;
            count++;
        }

        while(pos1<k){
            
           
            curr = curr.next;
            pos1++;

        }
        while(pos2<count-k+1){
            right = right.next;
            pos2++;
        }
        int temp = curr.val;
        curr.val = right.val;
        right.val = temp;
        


        return head;
        
    }
}