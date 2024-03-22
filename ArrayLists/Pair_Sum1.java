import java.util.ArrayList;
import java.util.Scanner;
public class Pair_Sum1 {
    //Brute Force Approach - O(n^2)
    public static boolean Pair_Sum1_Method1(ArrayList<Integer> list, int target){
        int sum;
        // System.out.println("All the required pairs are: ");
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                sum=list.get(i)+list.get(j);
                if(sum==target){
                    return true;
                }
            }
        }
        return false;
    }
    //2 Pointer Approach - O(n)
    public static boolean Pair_Sum1_Method2(ArrayList<Integer> list,int target){
        int lp=0,rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int n=5;
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter the element at index "+i+": ");
            list.add(sc.nextInt());
        }
        System.out.println(Pair_Sum1_Method2(list, 9));
    }
}
