public class ReverseLinkedlist {

        static Node head;

        public void push(int new_data){
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;

        }
        Node reverse(Node node) {
            Node prev = null;
            Node current = node;
            Node next = null;
            while(current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            node = prev;
            return node;

        }
        public void printList(Node node) {
            while (node != null) {
                System.out.println(node.data + " ");
                node = node.next;
            }
        }

        public static void main(String[] args) {
            ReverseLinkedlist linkedList = new ReverseLinkedlist();
            int x = 42;
            System.out.println("Given linked list: ");
            linkedList.push(16);
            linkedList.push(65);
            linkedList.push(100);
            linkedList.push(42);
            linkedList.push(21);

            linkedList.printList(head);
            System.out.println("----------------------------------");

            System.out.println("Reverse linked list: ");
            head = linkedList.reverse(head);
            linkedList.printList(head);;


        }



}
