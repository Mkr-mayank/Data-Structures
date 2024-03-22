public class Reverse_DoublyLL extends Double_Linkedlist{
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String args[]){
        Reverse_DoublyLL dll=new Reverse_DoublyLL();
        dll.addLast(3);
        dll.addLast(7);
        dll.addLast(5);
        dll.addLast(9);
        dll.print();
        dll.reverse();
        dll.print();
    }
}
