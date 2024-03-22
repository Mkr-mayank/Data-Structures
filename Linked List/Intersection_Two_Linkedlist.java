public class Intersection_Two_Linkedlist extends Linkedlist{
    public Node getIntersectionNode(Node head1,Node head2){
        Node t1=head1;
        while(t1!=null){
            Node t2=head2;
            while(t2!=null){
                if(t1==t2){
                    return t1;
                }
                t2=t2.next;
            }
            t1=t1.next;
        }
        return null;
    }

    public static void main(String args[]){
        Intersection_Two_Linkedlist ll=new Intersection_Two_Linkedlist();
        Node head1,head2;
        head1=new Node(1);
        head2=new Node(4);
        /* Test Case 1 */
        // Node newNode=new Node(2);
        // head1.next=newNode;
        // newNode=new Node(3);
        // head1.next.next=newNode;
        // newNode=new Node(5);
        // head2.next=newNode;
        // newNode=new Node(6);
        // head1.next.next.next=newNode;
        // head2.next.next=newNode;
        // newNode=new Node(7);
        // head2.next.next.next=newNode;
        // head2.next.next.next.next=null;
        /* Test Case 2 */
        Node newNode=new Node(2);
        head1.next=newNode;
        newNode=new Node(5);
        head2.next=newNode;
        newNode=new Node(6);
        head2.next.next=newNode;
        newNode=new Node(7);
        head2.next.next.next=newNode;
        head1.next.next=newNode;
        newNode=new Node(8);
        head1.next.next.next=newNode;
        head1.next.next.next.next=null;
        Node IntersectionPoint=ll.getIntersectionNode(head1,head2);
        if(IntersectionPoint==null){
            System.out.println("No Intersection Point");
        }
        else{
            System.out.println("Intersection Point: "+IntersectionPoint.data);
        }
    }
}
