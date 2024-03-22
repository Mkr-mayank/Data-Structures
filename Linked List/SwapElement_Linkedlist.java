
public class SwapElement_Linkedlist extends Linkedlist {
    public void Swap(int x,int y){
        if(x==y){
            return;
        }
        // while(temp!=null){
        //     if(temp.data==x){
        //         temp.data=y;
        //     }
        //     else if(temp.data==y){
        //         temp.data=x;
        //     }
        //     temp=temp.next;
        // }
        // return;
        Node prevX=null,currX=head;
        while(currX!=null && currX.data!=x){
            prevX=currX;
            currX=currX.next;
        }
        Node prevY=null,currY=head;
        while(currY!=null && currY.data!=y){
            prevY=currY;
            currY=currY.next;
        }
        if(prevX!=null){
            prevX.next=currY;
        }        
        else{
            head=currX;
        }
        if(prevY!=null){
            prevY.next=currX;
        }
        else{
            head=currY;
        }
        Node temp=currX.next;
        currX.next=currY.next;
        currY.next=temp;
    }
    public static void main(String args[]){
        SwapElement_Linkedlist ll=new SwapElement_Linkedlist();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.printList();
        ll.Swap(2,4);
        ll.printList();

    }
}
