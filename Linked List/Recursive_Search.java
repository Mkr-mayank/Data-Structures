public class Recursive_Search extends Linkedlist {
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key){
        return helper(head,key);
    }
    public static void main(String args[]){
        Recursive_Search ll=new Recursive_Search();
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(7);
        ll.addLast(1);
        ll.addLast(9);
        ll.printList();
        System.out.println(ll.recursiveSearch(7)); //Returns the index of the searching node
    }
}
