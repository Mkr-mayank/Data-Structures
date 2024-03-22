
public class Check_Palindrome extends Linkedlist{
    public Node findMid(Node temp){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //Step1- Find mid
        Node midNode=findMid(head);
        //Step2- Reverse the half linked list
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //Step3- Compare 1st half with the 2nd half
        Node right=prev;
        Node left=head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String args[]){
        Check_Palindrome ll=new Check_Palindrome();
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.printList();
        System.out.println(ll.checkPalindrome());
    }
}
