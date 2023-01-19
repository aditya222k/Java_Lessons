package DSA.LinkedList;

public class FindNthElement {

    public static int findNthElementFromEnd(ReverseALinkedList.Node head, int n) {
        int size=0;
        ReverseALinkedList.Node curr=head;

        while (curr != null) {
            curr=curr.next;
            size++;
        }
        int positionToSearch= size-n+1;
        ReverseALinkedList.Node currN=head;
        int i=1;
        while(i<positionToSearch){
            currN=currN.next;
            i++;
        }
        return currN.data;
    }

    public static void main(String[] args) {
        ReverseALinkedList list=new ReverseALinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();
        System.out.println(findNthElementFromEnd(list.head, 2));

    }
}
