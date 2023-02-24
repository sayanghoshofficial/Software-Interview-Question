import java.util.LinkedList;
public class nthNodeOfTheLinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void printNthFromLast(int n) {
        Node ptr1 = head;
        Node ptr2 = head;

        int count = 0;
        while (count < n) {
            if (ptr2 == null) {
                System.out.println(n + " is greater than the number of nodes in the list");
                return;
            }
            ptr2 = ptr2.next;
            count++;
        }

        while (ptr2 != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        System.out.println("Node at position " + n + " from end is " + ptr1.data);
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        linkedList.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        linkedList.printNthFromLast(2);
    }
}
