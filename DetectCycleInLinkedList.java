class ListNodeCycle {
    int val;
    ListNodeCycle next;
    ListNodeCycle(int val) { this.val = val; }
}

public class DetectCycleInLinkedList {
    public static boolean hasCycle(ListNodeCycle head) {
        ListNodeCycle slow = head;
        ListNodeCycle fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;           
            fast = fast.next.next;      
            if (slow == fast)
                return true; 
        }

        return false; 
    }

    public static void main(String[] args) {
        ListNodeCycle head = new ListNodeCycle(1);
        head.next = new ListNodeCycle(2);
        head.next.next = new ListNodeCycle(3);
        head.next.next.next = head.next; 

        System.out.println("Has Cycle: " + hasCycle(head)); 
    }
}