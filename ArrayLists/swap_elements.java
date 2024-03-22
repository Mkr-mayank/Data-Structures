import java.util.ArrayList;
public class swap_elements {
    public static void main(String args[]){
        ArrayList<Integer> list1=new ArrayList<>();
        int idx1=2,idx2=4;
        list1.add(6);
        list1.add(2);
        list1.add(8);
        list1.add(4);
        list1.add(1);
        System.out.println(list1);
        int temp=list1.get(idx1);
        list1.set(idx1, list1.get(idx2));
        list1.set(idx2,temp);
        System.out.println(list1);
    }
}
