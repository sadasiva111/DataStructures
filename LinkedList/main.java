package LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.appendNode(1);
        myLinkedList.appendNode(2);
        myLinkedList.appendNode(3);
        myLinkedList.insert(2, 8);
        myLinkedList.printList();
    }
}
