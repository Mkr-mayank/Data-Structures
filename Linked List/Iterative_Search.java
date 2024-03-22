public class Iterative_Search extends Linkedlist{
    public int iterativeSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String args[]){
        Iterative_Search ll=new Iterative_Search();
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(7);
        ll.addLast(1);
        ll.addLast(9);
        ll.printList();
        System.out.println(ll.iterativeSearch(1)); //Returns the index of the searching node
    }
}