import java.util.ArrayList;
import java.util.Scanner;
public class Monotonic_ArrayList {
    public static boolean Check_Monotonic(ArrayList<Integer> list){
        boolean inc=true,dec=true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                inc=false;
            }
            if(list.get(i)<list.get(i+1)){
                dec=false;
            }
        }
        return inc||dec;
    }
    public static void main(String args[]){
        int n=4;
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter the element at index "+i+": ");
            list.add(sc.nextInt());
        }
        System.out.println(Check_Monotonic(list));
    }
}
