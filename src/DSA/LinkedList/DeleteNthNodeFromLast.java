package DSA.LinkedList;
//https://www.youtube.com/watch?v=cL4gHVuFOvk
public class DeleteNthNodeFromLast {

    public static ReverseALinkedList.Node removeNthNodeFromEnd(ReverseALinkedList.Node head, int n) {
        if (head.next == null) {
            return null;
        }
        int size=0;
        ReverseALinkedList.Node curr=head;
        while (curr != null) {//Finding the size of the list
            curr=curr.next;
            size++;
            System.out.println(size);
        }

        if(n==size){
            return head.next;
        }

        int indexSearch = size-n;// to find the position of the value of the node to be deleted
        ReverseALinkedList.Node prev= head;
        int i=0;
        while (i<indexSearch){//go to the element to be searched-1
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;//skipping a node in the middle to directly jump the next
        return head;
    }
    public static void main(String[] args) {
        ReverseALinkedList list=new ReverseALinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        removeNthNodeFromEnd(list.head,2);
        list.printList();

    }
}
