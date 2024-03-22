public class Reverse_Linkedlist extends Linkedlist {
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String args[]){
        Reverse_Linkedlist ll=new Reverse_Linkedlist();
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(7);
        ll.addLast(1);
        ll.addLast(9);
        ll.printList();
        ll.reverse();
        ll.printList();
    }
}
