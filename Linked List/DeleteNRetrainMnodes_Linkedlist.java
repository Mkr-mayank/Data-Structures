// import java.util.*;
public class DeleteNRetrainMnodes_Linkedlist extends Linkedlist {
    public void DeleteNode(int M, int N){
        Node temp=head;
        Node newTemp;
        while(temp!=null){
            int m=1;
            int n=1;
            while(m<M && temp!=null){
                temp=temp.next;
                m++;
            }
            if(temp==null){
                return;
            }
            newTemp=temp.next;
            while(n<N && newTemp!=null){
                newTemp=newTemp.next;
                n++;
            }
            if(newTemp!=null){
                temp.next=newTemp.next;
            // temp.next=newTemp;
                newTemp.next=null;
            }
            temp=temp.next;
        }
        return;
    }
    public static void main(String args[]){
        DeleteNRetrainMnodes_Linkedlist ll=new DeleteNRetrainMnodes_Linkedlist();
        // LinkedList <Integer> ll=new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(10);
        ll.addLast(11);
        // ll.addLast(8);
        ll.printList();
        ll.DeleteNode(5,2);
        ll.printList();
    }
}