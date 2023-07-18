package LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.appendNode(1);
        myLinkedList.appendNode(2);
        myLinkedList.appendNode(3);
        System.out.println(myLinkedList.set(2, 4));
        myLinkedList.printList();
    }
}
