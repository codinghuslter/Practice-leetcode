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
    public boolean isPalindrome(ListNode head) {
        
        Stack<Integer> stack = new Stack<>();
        
        ListNode curr=head;
        
        while(curr!=null)
        {
            stack.push(curr.val);
            curr=curr.next;
        }
        //curr=head;
        
        while(head!=null)
        {
            if(stack.pop() != head.val)
                return false;
            head=head.next;
            //curr=curr.next;
        }
        return true;
        
    }
}