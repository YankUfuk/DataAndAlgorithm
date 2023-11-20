public class DeletionInCircularLinkedList {

        Node head;

        static Node push(Node head_ref, int data) {
            Node ptr1 = new Node();
            ptr1.data = data;
            ptr1.next = head_ref;
            if (head_ref != null) {
                Node temp = head_ref;
                while (temp.next != head_ref) {
                    temp = temp.next;
                }
                temp.next = ptr1;
            }
            else {
                ptr1.next = ptr1;
            }
            head_ref = ptr1;
            return head_ref;

        }
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

        static int countNodes(Node head) {
            Node temp = head;
            int count = 0;
            if (head != null) {
                do {
                    temp = temp.next;
                    count++;
                }while (temp != head);
            }
            return count;
        }
        static Node deleteNode(Node head, int key) {
            if (head == null) {
                return null;
            }

            Node curr = head, prev = new Node();
            while (curr.data != key) {
                if (curr.next == head) {
                    System.out.println("Given node is not found in the list.");
                    break;
                }
                prev = curr;
                curr = curr.next;
            }
            if (curr == head && curr.next == head) {
                head = null;
                return head;
            }

            if (curr == head) {
                prev = head;
                while (prev.next != head) {
                    prev = prev.next;
                }
                head = curr.next;
                prev.next = head;
            }
            else if (curr.next == head) {
                prev.next = head;
            }
            else {
                prev.next = curr.next;
            }
            return head;
        }

        public static void main(String[] args) {
            DeletionInCircularLinkedList list = new DeletionInCircularLinkedList();
            Node head = null;
            head = push(head, 42);
            head = push(head, 54);
            head = push(head, 27);
            head = push(head, 39);

            System.out.println("Original List: ");
            list.printList(head);
            System.out.println("-------------------------");
            //System.out.println(countNodes(head));
            System.out.println("After Deletion: ");
            deleteNode(head, 42);
            list.printList(head);
        }

        static class Node {
            int data;
            Node next;
        }
}
