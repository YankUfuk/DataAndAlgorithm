class LinkedListSearch {
    Node head;

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;

    }

    public boolean search(Node head,int x){
        Node current = head;
        while (current.next != null){
            if (current.data == x) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListSearch linkedList = new LinkedListSearch();
        int x = 42;

        linkedList.push(16);
        linkedList.push(65);
        linkedList.push(100);
        linkedList.push(42);
        linkedList.push(21);

            if (linkedList.search(linkedList.head, x)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
    }
}

