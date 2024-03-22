import java.util.ArrayList;
import java.util.Scanner;
public class Container_With_MaxWater {
    //Brute Force Approach - O(n^2)
    public static int Calculate_MaxWater_Method1(ArrayList<Integer> list){
        int curr_water,max_water=0,height,width;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                height=Math.min(list.get(i),list.get(j));
                width=j-i;
                curr_water=width*height;
                max_water=Math.max(max_water,curr_water);
            }
        }
        return max_water;
    }
    //2 Pointer Approach - O(n)
    public static int Calculate_MaxWater_Method2(ArrayList<Integer> list){
        int curr_water,max_water=0,height,width;
        int lp=0,rp=list.size()-1;
        while(lp<rp){
            height=Math.min(list.get(lp),list.get(rp));
            width=rp-lp;
            curr_water=height*width;
            max_water=Math.max(max_water,curr_water);
            if(list.get(lp)<list.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return max_water;
    }
    public static void main(String args[]){
        int n=9;
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter the height of line "+i+": ");
            list.add(sc.nextInt());
        }
        
        System.out.println(Calculate_MaxWater_Method2(list));
    }
}
