public class LinkedListDeletion {
        Node head;
        public void push(int new_data){
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;

        }
        public boolean isIdentical(IdenticalLinkedList listb) {
            Node a = this.head, b = listb.head;
            while (a != null && b != null) {
                if(a.data != b.data) {
                    return false;
                }
                a = a.next;
                b = b.next;
            }
            return (a == null && b == null);
        }


        public static void main(String[] args) {
            IdenticalLinkedList linkedList = new IdenticalLinkedList();
            IdenticalLinkedList linkedList2 = new IdenticalLinkedList();

            linkedList.push(16);
            linkedList.push(65);
            linkedList.push(100);
            linkedList.push(42);
            linkedList.push(21);

            linkedList2.push(16);
            linkedList2.push(65);
            linkedList2.push(10);
            linkedList2.push(42);
            linkedList2.push(21);

            if (linkedList.isIdentical(linkedList2) == true) {
                System.out.println("Lists are identical. ");
            }
            else {
                System.out.println("Lists are not identical. ");
            }

        }



}
