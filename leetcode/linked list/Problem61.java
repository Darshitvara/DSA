
// 61. Rotate List
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Given the head of a linked list, rotate the list to the right by k places.

 

// Example 1:


// Input: head = [1,2,3,4,5], k = 2
// Output: [4,5,1,2,3]
// Example 2:


// Input: head = [0,1,2], k = 4
// Output: [2,0,1]
 

// Constraints:

// The number of nodes in the list is in the range [0, 500].
// -100 <= Node.val <= 100
// 0 <= k <= 2 * 109

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
    public ListNode rotateRight(ListNode head, int k) {
        int counter = 0;
        ListNode current = head;
        if(current == null) return head;
  
        while(current.next != null){
            counter++;
            current = current.next;
        }
        counter++;
        current.next = head;
        
        k = k % counter;
        if(k == 0) {
            current.next = null;
            return head;
        }
        
        // Move to the (counter - k)th node to break the circle
        current = head;
        for(int i = 0; i < counter - k - 1; i++){
            current = current.next;
        }
        
        ListNode result = current.next;
        current.next = null;
        return result;
    }
}