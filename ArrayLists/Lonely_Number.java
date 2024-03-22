import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Lonely_Number {
    public static ArrayList<Integer> Find_Lonely(ArrayList<Integer> num){
        Collections.sort(num);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<num.size()-1;i++){
            if(num.get(i-1)+1<num.get(i) && num.get(i)+1<num.get(i+1)){
                list.add(num.get(i));
            }
        }
        if(num.size()==1){
            list.add(num.get(0));
        }
        if(num.size()>1){
            if(num.get(0)+1<num.get(1)){
                list.add(num.get(0));
            }
            if(num.get(num.size()-2)+1<num.get(num.size()-1)){
                list.add(num.get(num.size()-1));
            }
        }
        return list;
    }
    public static void main(String args[]){
        int n=4;
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter the element at index "+i+": ");
            list.add(sc.nextInt());
        }
        System.out.println(Find_Lonely(list));

    }
}
