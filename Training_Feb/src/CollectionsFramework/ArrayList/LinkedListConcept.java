package CollectionsFramework.ArrayList;

public class LinkedListConcept {

    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next =null;
        }
    }

    public static void main(String[] args) {

        LinkedListConcept l1 = new LinkedListConcept();
        Node first = l1.new Node(10);
        l1.head= first;
        Node second = l1.new Node(20);
        first.next= second;
        Node third = l1.new Node(30);
        second.next= third;
        Node fourth = l1.new Node(40);
        third.next= fourth;

        l1.printLinkedList();

    }

    public void printLinkedList(){
        Node n = head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
}
