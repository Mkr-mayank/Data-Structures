public class Remove_Cycle extends Detect_Loop {
    public static void RemoveCycle(){
        //Detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //Find the meeting point 
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle -> last.next=null
        prev.next=null;
    }
    public static void main(String args[]){
        head=new Node(7);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(5);
        head.next.next.next.next=head.next;
        System.out.println(isCycle());
        RemoveCycle();
        System.out.println(isCycle());
    }
}   
