package DSA.LinkedList;
//TODO: HARE TURTLE APPROACH


/*
1> middle of the LL
2> 2nd half reverse
3> compare 1st half and second half
*/

public class PalindromeCheck {

    static ReverseALinkedList.Node reverse(ReverseALinkedList.Node head){

        ReverseALinkedList.Node prev= head;
        ReverseALinkedList.Node curr = head.next;
        while(curr!= null){
            ReverseALinkedList.Node nextNode =curr.next;
            curr.next = prev;

            prev=curr;
            curr=nextNode;
        }
        head.next=null;
        head=prev;

        return(head);

    }
    static ReverseALinkedList.Node findMiddle(ReverseALinkedList.Node head){
        ReverseALinkedList.Node hare =head;
        ReverseALinkedList.Node turtle= head;
        while(hare.next!= null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }

    static boolean isPalindrome(ReverseALinkedList.Node head) {
        if(head ==null||head.next == null){
            return true;
        }
        ReverseALinkedList.Node middle= findMiddle(head);//1st half ka end
        ReverseALinkedList.Node secondHalfStart= reverse(middle.next);

        ReverseALinkedList.Node firstHalfStart=head;
        while(secondHalfStart!=null){
            if(secondHalfStart.data!= firstHalfStart.data){
                return false;
            }
            secondHalfStart=secondHalfStart.next;
            firstHalfStart=firstHalfStart.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ReverseALinkedList list=new ReverseALinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(25);
        list.addLast(3);
        list.addLast(25);
        list.addLast(2);
        list.addLast(1);
        list.printList();
        System.out.println(isPalindrome(list.head));
    }
}
