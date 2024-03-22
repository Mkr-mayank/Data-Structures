import java.util.ArrayList;
import java.util.Scanner;
public class most_Frequent_Number {
    public static int Frequent(ArrayList<Integer> num,int key){
        int result[]=new int[1000];
        int max=0;
        int ans=0;
        for(int i=0;i<num.size()-1;i++){
            if(num.get(i)==key){
                result[num.get(i+1)-1]++;
            }
        }
        for(int i=0;i<1000;i++){
            if(result[i]>max){
                max=result[i];
                ans=i+1;
            }
        }
        return ans;
    }
    // public static int Frequent1(ArrayList<Integer> num, int key) {
    //     int maxCount = 0;
    //     int mostFrequent = 0;

    //     for (int i = 0; i < num.size() - 1; i++) {
    //         if (num.get(i) == key) {
    //             int nextElement = num.get(i + 1);
    //             int count = 1;

    //             // Count consecutive occurrences
    //             while (i + 1 < num.size() && num.get(i + 1) == nextElement) {
    //                 count++;
    //                 i++;
    //             }

    //             if (count > maxCount) {
    //                 maxCount = count;
    //                 mostFrequent = nextElement;
    //             }
    //         }
    //     }

    //     return mostFrequent;
    // }
    public static void main(String args[]){
        int n=5;
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter the element at index "+i+": ");
            list.add(sc.nextInt());
        }
        System.out.println(Frequent(list,2));
    }
    
}
