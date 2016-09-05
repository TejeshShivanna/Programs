import LinkedList.LinkedListPrograms;

public class Programs {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};

        // Linked list
        LinkedListPrograms linkedListPrograms = new LinkedListPrograms();
        linkedListPrograms.addToList(arr);
        //linkedListPrograms.setHead(linkedListPrograms.reverseByPosition(linkedListPrograms.getHead(),1,2));
        linkedListPrograms.setHead(linkedListPrograms.reverseList(linkedListPrograms.getHead()));
        linkedListPrograms.printList();
    }
}
