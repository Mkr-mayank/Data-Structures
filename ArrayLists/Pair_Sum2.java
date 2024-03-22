import java.util.ArrayList;
import java.util.Scanner;
public class Pair_Sum2 {
    public static boolean Calculate_Sum(ArrayList<Integer> list,int target){
        int lp,rp,n=list.size(),bp=-1;
        //Calculate pivot
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        lp=bp+1;
        rp=bp;
        //Check Target Sum
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int n=6;
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter the element at index "+i+": ");
            list.add(sc.nextInt());
        }
        System.out.println(Calculate_Sum(list, 16));
    }

}
