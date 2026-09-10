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
        int count = 0;
        int i =0;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null){
            fast = fast.next;
            count++;
        }
        while (i < count / 2) {
            slow = slow.next;
            i++;
        }

        return slow;
    }

}