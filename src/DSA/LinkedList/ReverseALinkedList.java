package DSA.LinkedList;
// https://www.youtube.com/watch?v=t7YaoQOFXzk

public class ReverseALinkedList {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }

    }

    public void addStart(int data) {//add node to the start
        Node newNode=new Node(data);//creates new node
        if (head == null) {
            head=newNode;
            return;
        }
        newNode.next=head;//newNode that we are creating will point towards the old first node which was(is) the head
        head=newNode;//We give head a new value which is the new node that we are adding in the starting
    }

    void addLast(int  data) {
        Node newNode=new Node(data);
        if (head == null) {
            head=newNode;
            return;
        }
        Node currNode=head;// we take currNode which is a temporary node because we cannot change the original head as data is lost becuase of that
        while (currNode.next != null) {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    void printList() {
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while (currNode != null) {
            System.out.print((currNode.data+" ----> "));
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    void deleteFirst(){
        if(head==null){
            System.out.println("no list available");
            return;
        }
        head=head.next;
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("no list available");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secLastNode=head; // i
        Node lastNode=head.next;//i+1
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secLastNode=secLastNode.next;
        }
        System.out.println(lastNode);
        secLastNode.next=null;
    }

    void reverseIteration(){
        Node previous=head;
        Node currNode=head.next;

        if(head==null || head.next==null){
            return;
        }

        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next=previous;

            previous=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=previous;
    }

    public static void main(String[] args) {
        ReverseALinkedList list=new ReverseALinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();
        list.reverseIteration();
        list.printList();

    }
}
