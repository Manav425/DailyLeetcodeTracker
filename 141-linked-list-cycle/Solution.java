/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow= head;
        ListNode fast=head;
        boolean hasLoop=false;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
            if(slow==fast){
                return hasLoop=true;
            }
        }
        return hasLoop;
    }
}