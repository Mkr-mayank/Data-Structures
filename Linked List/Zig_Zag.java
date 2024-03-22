public class Zig_Zag extends Linkedlist{
    public void zigzag(){
        //Find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        //reverse 2nd half
        Node prev=null;
        Node curr=mid.next;
        mid.next=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //alter merge - zig-zag merge
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        while(left!=null && right!=null){
            //Alter
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            //Update
            left=nextL;
            right=nextR;
        }
    }
    public static void main(String args[]){
        Zig_Zag ll=new Zig_Zag();
        ll.addFirst(4);
        ll.addFirst(9);
        ll.addFirst(3);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(2);
        ll.printList();
        ll.zigzag();
        ll.printList();
    }
}
