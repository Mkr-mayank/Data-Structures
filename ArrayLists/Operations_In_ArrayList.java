import java.util.ArrayList;
import java.util.Collections;
public class Operations_In_ArrayList{
    public static void main(String args[]){
        ArrayList<Integer> list1=new ArrayList<>();
        // Scanner sc=new Scanner(System.in);
        // int n=5;
        // int data;
        // System.out.println("Enter "+n+" elements in the List: ");
        // for(int i=1;i<=n;i++){
        //     data=sc.nextInt();
            //Add Operation - O(1)
            // list1.add(data);
        // }
        //Add Operation - O(1)
        list1.add(6);
        list1.add(1);
        list1.add(4);
        list1.add(3);
        list1.add(7);
        System.out.println(list1);
        //Add Operation at Index - O(n)
        list1.add(2,8);
        System.out.println(list1);
        //Get Element from its index - O(1)
        System.out.println(list1.get(3));
        //Remove Element from an index - O(n)
        list1.remove(4);
        System.out.println(list1);
        //Set Element at Index - O(n)
        list1.set(2, 9);
        System.out.println(list1);
        //Check for an element
        System.out.println(list1.contains(12));
        //Size of list
        System.out.println(list1.size());
        //Sorting a list
        Collections.sort(list1); //Sorting in Ascending order
        Collections.sort(list1,Collections.reverseOrder()); //Sorting in Descending order
        System.out.println(list1);
    }
}