/*public class CircularLinkedList {
    Node head;
    public void printList(Node head)
    {
        Node temp = head;
        if (head != null) {
            do {
                System.out.printf("%d ", temp.data);
                temp = temp.next;
            } while (temp != head);
        }

        System.out.printf("\n");
    }
    public void push(int new_data) {
        Node node = new Node(new_data);
        node.next = head;
        head = node;
    }
    public boolean isCircular(Node head) {
        if (head == null) {
            return true;
        }

        Node node = head.next;

        while(null != null && node != head) {
            node = node.next;
        }

        return (node == head);
    }
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Node head = null;
        /*head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        list.push(head, 10);
        list.push(head, 20);
        list.push(head, 30);
        list.push(head, 40);

        System.out.println(list.isCircular(head));

        System.out.println("------------------------------------");
        head = head.next.next.next.next;

        System.out.println(list.isCircular(head));
        list.printList(head);
    }
}*/
