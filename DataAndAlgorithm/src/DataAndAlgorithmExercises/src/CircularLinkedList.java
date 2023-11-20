public class CircularLinkedList {
    Node head;
     void printList(Node head)
    {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.printf("\n");
    }

    public boolean isCircular(Node head) {
        if (head == null) {
            return true;
        }

        Node node = head.next;

        while(node != null && node != head) {
            node = node.next;
        }

        return (node == head);
    }
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);


        System.out.println("Is circular ? " + list.isCircular(head));

        System.out.println("--------------------------------------");
        head.next.next.next.next = head;
        System.out.println("Is circular ? " + list.isCircular(head));
        System.out.println("--------------------------------------");
        list.printList(head);
    }

    static class Node {
         int data;
         Node next;

         Node(int d) {
             data = d;
             next = null;
         }
    }


}



