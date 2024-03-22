import java.util.ArrayList;
public class maximum_in_List {
    public static void main(String args[]){
        int max=Integer.MIN_VALUE;  
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(5);
        list1.add(8);
        list1.add(3);
        list1.add(4);
        list1.add(9);
        list1.add(2);
        System.out.println(list1);
        for(int i=0;i<list1.size();i++){
            if(list1.get(i)>max){
                max=list1.get(i);
            }
        }
        System.out.println("Maximum element in the list is "+max);
    }
}
