import java.util.Scanner;
public class Even_Odd_LinkedList extends Linkedlist {
    public void EvenOdd(){
        Node curr=head;
        Node peven=null;
        Node iodd=null;
        Node nodd=null;
        while(curr!=null){
            if(curr.data%2==0){
                if(peven==null){
                    peven=curr;
                    head=peven;
                }
                else{
                    peven.next=curr;
                    peven=curr;
                }
            }
            else{
                if(iodd==null){
                    iodd=curr;
                    nodd=curr;
                }
                else{
                    nodd.next=curr;
                    nodd=curr;
                }
            }
            curr=curr.next;
        }
        if(peven==null){
            head=iodd;
            return;
        }
        if(iodd==null){
            return;
        }
        if(peven.next==null){
            nodd.next=peven.next;
        }
        peven.next=iodd;
        return;
    }
    public static void main(String args[]){
        Even_Odd_LinkedList ll=new Even_Odd_LinkedList();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("How many elements do you want to enter in the LinkedList? ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("Enter element "+i+" : ");
            ll.addLast(sc.nextInt());
        }
        ll.printList();
        ll.EvenOdd();
        ll.printList();
        sc.close();
    }
}