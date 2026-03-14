package LinkedLists;

public class deleteAllOccurenceDLL {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next, ListNode prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public static ListNode deleteAllOccurrences(ListNode head, int key) {
        // 1. Always start at the head
        ListNode temp = head;

        // 2. Loop through the entire list
        while (temp != null) {

            // 3. Did we find the key?
            if (temp.val == key) {

                // Case A: The node to delete is the Head
                if (temp == head) {
                    head = head.next; // Move head forward
                    if (head != null) {
                        head.prev = null; // Disconnect the old head
                    }
                }
                // Case B: The node is in the middle or at the very end
                else {
                    ListNode prevNode = temp.prev;
                    ListNode nextNode = temp.next;

                    prevNode.next = nextNode; // Connect previous to next

                    // If it's NOT the last node, connect next back to previous
                    if (nextNode != null) {
                        nextNode.prev = prevNode;
                    }
                }
            }
            // 4. Move forward to check the next node
            temp = temp.next;
        }

        return head;
    }

    // ==========================================
    // Helper Methods & PSVM for Testing
    // ==========================================

    // Helper to print list forwards and backwards (proves DLL is fully connected)
    public static void printList(ListNode head) {
        ListNode temp = head;
        ListNode tail = null;

        System.out.print("Forward:  ");
        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            tail = temp; // Keep track of the last node
            temp = temp.next;
        }
        System.out.println("null");

        System.out.print("Backward: ");
        while (tail != null) {
            System.out.print(tail.val + " <-> ");
            tail = tail.prev;
        }
        System.out.println("null\n");
    }

    // Helper to add a node to the end
    public static ListNode insertAtTail(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) return newNode;

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = null;

        // Create a list with multiple occurrences of '2'
        // List: 2 <-> 2 <-> 1 <-> 2 <-> 3 <-> 2
        head = insertAtTail(head, 2);
        head = insertAtTail(head, 2);
        head = insertAtTail(head, 1);
        head = insertAtTail(head, 2);
        head = insertAtTail(head, 3);
        head = insertAtTail(head, 2);

        System.out.println("--- Original List ---");
        printList(head);

        int keyToDelete = 2;
        System.out.println("Deleting all occurrences of: " + keyToDelete);

        // Call your method!
        head = deleteAllOccurrences(head, keyToDelete);

        System.out.println("--- Updated List ---");
        printList(head); // Should output: 1 <-> 3
    }
}