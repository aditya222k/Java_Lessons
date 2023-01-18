
package DSA;
//https://www.youtube.com/watch?v=oAja8-Ulz6o
//Head is the first node
public class LL {
    Node head;

    static class Node {

        String data;
        Node next;
        Node(String data) {
            this.data=data;
            this.next=null;
        }

    }

    public void addStart(String data) {//add node to the start
        Node newNode=new Node(data);//creates new node
        if (head == null) {
            head=newNode;
            return;
        }
        newNode.next=head;//newNode that we are creating will point towards the old first node which was(is) the head
        head=newNode;//We give head a new value which is the new node that we are adding in the starting
    }

    void addLast(String data) {
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

    public static void main(String[] args) {
        LL list=new LL();
        list.addStart("a");
        list.addStart("is");
        list.printList();
        list.addLast("list");
        list.printList();
        list.addStart("this");
        list.printList();
        list.deleteLast();
        list.deleteLast();
        list.printList();
    }
}
