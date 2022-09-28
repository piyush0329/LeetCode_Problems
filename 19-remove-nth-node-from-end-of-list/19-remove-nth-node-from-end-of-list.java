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
    public ListNode removeNthFromEnd(ListNode head, int n) {
//          if(head == null){
//             return null;
//         }
//         // if(n==1){
//         //    head=null;
//         //     return head;
//         // }
//         // ListNode prev = null;
        
//         ListNode mainPtr = head;
//         ListNode refPtr = head;
//         int count =0;
//         while(count<n){
//             // if(refPtr==null){
//             //     throw new IllegalArgumentException("value is greater than the number of nodes in list");
//             // }
//             refPtr= refPtr.next;
//             count++;
//         }
//         while(refPtr!=null){
//             refPtr=refPtr.next;
//            // prev = mainPtr;
//             mainPtr = mainPtr.next;
//         }
//       slow.next=slow.next.next;
//         return start.next;
         ListNode start = new ListNode(0);
        start.next=head;   
        ListNode  slow=start , fast=start;   
        //Move fast in front so that the gap between slow and fast becomes n
        for(int i=1 ; i<=n+1 ; i++){
            fast=fast.next;
        }
        //Move fast to the end, maintaining the gap
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        //Skip the desired node
        slow.next=slow.next.next;
        return start.next;
    }
}