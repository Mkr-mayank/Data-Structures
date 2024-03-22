public class Remove_NthNode_FromEnd extends Linkedlist{
    public void deleteNthFromEnd(int n){
        //Calculate size of linked list
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;
            return;
        }
        int i=1;
        int iToFind=size-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void main(String args[]){
        Remove_NthNode_FromEnd ll=new Remove_NthNode_FromEnd();
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(7);
        ll.addLast(1);
        ll.addLast(9);
        ll.printList();
        ll.deleteNthFromEnd(2);
        ll.printList();
    }
}
