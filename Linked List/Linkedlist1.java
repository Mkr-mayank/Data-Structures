import java.util.LinkedList;
public class Linkedlist1 {
    public static void main(String args[]){
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addLast(2);
        ll.addLast(9);
        ll.addLast(7);
        ll.addFirst(4);
        // 4-2-9-7
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        ll.addLast(6);
        System.out.println(ll);
    }
}
