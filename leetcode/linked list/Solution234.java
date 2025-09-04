// 234. Palindrome Linked List
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

 

// Example 1:


// Input: head = [1,2,2,1]
// Output: true
// Example 2:


// Input: head = [1,2]
// Output: false
 

// Constraints:

// The number of nodes in the list is in the range [1, 105].
// 0 <= Node.val <= 9

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
class Solution234 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        while(slow != null){
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        while(prev != null){
            if(prev.val != head.val ) return false;
            prev = prev.next;
            head = head.next;
        }
        return true;
    }
}