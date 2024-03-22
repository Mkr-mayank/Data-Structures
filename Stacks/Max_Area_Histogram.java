import java.util.*;
public class Max_Area_Histogram { //O(n)
    public static void findnextSmallerLeft(int arr[], int nextSmaller[]){ //O(n)
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmaller[i]=-1;
            }
            else{
                nextSmaller[i]=s.peek();
            }
            s.push(i);
        }
    }
    public static void findnextSmallerRight(int arr[],int nextSmaller[]){ //O(n)
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmaller[i]=arr.length;
            }
            else{
                nextSmaller[i]=s.peek();
            }
            s.push(i);
        }
    }
    public static int calculateMax(int height[]){ //O(n)
        int nsl[]=new int[height.length];
        int nsr[]=new int[height.length];
        findnextSmallerRight(height,nsr);
        findnextSmallerLeft(height,nsl);
        int max_area=0,area,width;
        for(int i=0;i<height.length;i++){
            width=nsr[i]-nsl[i]-1;
            area=width*height[i];
            max_area=Math.max(max_area,area);
        }
        return max_area;
    }
    public static void main(String args[]){
        int height[]={2,5,6,2,3};
        System.out.println(calculateMax(height));
    }
}
