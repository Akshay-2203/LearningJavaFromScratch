package learning.java;
import java.util.HashMap;
import java.util.Map;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class RemoveZeroSumSublists {
    
    public static ListNode removeZeroSumSublists(ListNode head) {
        // Dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // HashMap to store the prefix sum and corresponding node
        Map<Integer, ListNode> prefixSumMap = new HashMap<>();
        int prefixSum = 0;
        
        // First pass to record the prefix sum and corresponding node
        for (ListNode current = dummy; current != null; current = current.next) {
            prefixSum += current.val;
            prefixSumMap.put(prefixSum, current);
        }
        
        // Reset prefix sum and make second pass to remove zero sum sublists
        prefixSum = 0;
        for (ListNode current = dummy; current != null; current = current.next) {
            prefixSum += current.val;
            // Connect the current node to the next node where the prefix sum was seen last time
            current.next = prefixSumMap.get(prefixSum).next;
        }
        
        return dummy.next;
    }
    
    // Helper method to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Example 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(1);
        ListNode result1 = removeZeroSumSublists(head1);
        printList(result1); // Output: 3 1

        // Example 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(-3);
        head2.next.next.next.next = new ListNode(4);
        ListNode result2 = removeZeroSumSublists(head2);
        printList(result2); // Output: 1 2 4

        // Example 3
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        head3.next.next = new ListNode(3);
        head3.next.next.next = new ListNode(-3);
        head3.next.next.next.next = new ListNode(-2);
        ListNode result3 = removeZeroSumSublists(head3);
        printList(result3); // Output: 1
    }
}