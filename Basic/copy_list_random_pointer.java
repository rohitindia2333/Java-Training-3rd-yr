import java.util.HashMap;
import java.util.Map;
class Node {
    int val;
    Node next;
    Node random;
    Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class copy_list_random_pointer {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Map<Node, Node> nodeMap = new HashMap<>();
        Node current = head;
        while (current != null) {
            nodeMap.put(current, new Node(current.val));
            current = current.next;
        }
        current = head;
        while (current != null) {
            Node newNode = nodeMap.get(current);
            newNode.next = nodeMap.get(current.next);
            newNode.random = nodeMap.get(current.random);
            current = current.next;
        }
        return nodeMap.get(head);
    }
    public static void printLinkedList(Node head) {
        while (head != null) {
            int randomVal = (head.random != null) ? head.random.val : -1;
            System.out.println("Value: " + head.val + ", Random: " + randomVal);
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node head1 = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);
        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        head1.random = null;
        node2.random = head1;
        node3.random = node5;
        node4.random = node3;
        node5.random = head1;
        copy_list_random_pointer solution = new copy_list_random_pointer();
        Node copiedHead = solution.copyRandomList(head1);
        printLinkedList(copiedHead);
    }
}
