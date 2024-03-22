import java.util.ArrayList;
public class Reverse_printlist {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(9);
        System.out.println(list);
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    
}
