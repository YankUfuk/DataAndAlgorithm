public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> linkedListWithPush = new java.util.LinkedList<String>();

        linkedListWithPush.push("Y");
        linkedListWithPush.push("A");
        linkedListWithPush.push("N");
        linkedListWithPush.push("K");
        linkedListWithPush.push("I");
        System.out.println("Creating linkedlist with push" + linkedListWithPush);
        System.out.println("Looking first element of the linkedlist : " + linkedListWithPush.peekFirst());
        System.out.println("-----------------------------------------------");

        java.util.LinkedList<String> linkedListWithOffer = new java.util.LinkedList<String>();
        linkedListWithOffer.offer("Y");
        linkedListWithOffer.offer("A");
        linkedListWithOffer.offer("N");
        linkedListWithOffer.offer("K");
        linkedListWithOffer.offer("I");
        System.out.println("Creating linkedlist with push " + linkedListWithOffer);
        System.out.println("Looking last element of the linkedlist : " + linkedListWithOffer.peekLast());
        System.out.println("Removing element from linkedlist " + linkedListWithOffer.remove(3));
        System.out.println("-----------------------------------------------");



    }

}
