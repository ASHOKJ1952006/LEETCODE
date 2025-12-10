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
        // Edge case: 0 or 1 node -> after deleting middle, list is empty
        if (head == null || head.next == null) {
            return null;
        }

        ListNode temp = null;
        ListNode fast = head;
        ListNode slow = head;

        // Find middle using slow-fast pointers
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            temp = slow;       // previous of slow
            slow = slow.next;  // middle candidate
        }

        // Delete middle node (slow) by skipping it
        temp.next = temp.next.next;

        return head;
    }
}
