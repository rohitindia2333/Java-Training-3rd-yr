class Node {
    int data;
    Node next;
    Node bottom;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.bottom = null;
    }
}

public class gfg_problem {
    public static Node mergeSortedLists(Node list1, Node list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        Node merged;
        if (list1.data < list2.data) {
            merged = list1;
            merged.bottom = mergeSortedLists(list1.bottom, list2);
        } else {
            merged = list2;
            merged.bottom = mergeSortedLists(list1, list2.bottom);
        }
        return merged;
    }

    public static Node gfg_problem(Node head) {
        if (head == null || head.next == null)
            return head;
        head.next = gfg_problem(head.next);
        head = mergeSortedLists(head, head.next);
        return head;
    }

    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + "-> ");
            head = head.bottom;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(19);
        head.next.next.next = new Node(28);
        head.bottom = new Node(7);
        head.bottom.bottom = new Node(8);
        head.next.bottom = new Node(20);
        head.next.next.bottom = new Node(22);
        head.next.next.next.bottom = new Node(35);
        head.next.bottom.next = new Node(50);
        head.next.next.next.bottom.next = new Node(40);
        head.next.next.next.bottom.next.bottom = new Node(45);
        Node flattenedHead = gfg_problem(head); // Flatten link through to the linklist
        printLinkedList(flattenedHead); // Print the result
    }
}
