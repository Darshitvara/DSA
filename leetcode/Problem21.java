// 21. Merge Two Sorted Lists
// Solved
// Easy
// Topics
// Companies
// You are given the heads of two sorted linked lists list1 and list2.

// Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

// Return the head of the merged linked list.

 

// Example 1:


// Input: list1 = [1,2,4], list2 = [1,3,4]
// Output: [1,1,2,3,4,4]
// Example 2:

// Input: list1 = [], list2 = []
// Output: []
// Example 3:

// Input: list1 = [], list2 = [0]
// Output: [0]
 

// Constraints:

// The number of nodes in both lists is in the range [0, 50].
// -100 <= Node.val <= 100
// Both list1 and list2 are sorted in non-decreasing order.


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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list1 = l1;
        ListNode list2 = l2;
        ListNode l3 = new ListNode();
        ListNode list3 = l3;

        while(list1 != null || list2 != null){
            ListNode tempList;
            if(list1 == null){
                tempList = new ListNode(list2.val);
                list2 = list2.next;
            }else if (list2 == null){
                tempList = new ListNode(list1.val);
                list1 = list1.next;
            }else{
                if(list1.val < list2.val){
                tempList = new ListNode(list1.val);
                list1 = list1.next;
            }
            else{
                tempList = new ListNode(list2.val);
                list2 = list2.next;
            }
            }
            
            list3.next = tempList;
            list3 = list3.next;
        }
        return l3.next;
    }
}