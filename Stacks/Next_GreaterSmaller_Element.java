/*There are four different forms
1. nextGreater Right (we have done here)
2. nextGreater Left
3. nextSmaller Right
4. nextSmaller Left*/
import java.util.*;
public class Next_GreaterSmaller_Element {
    //nextGreater Right
    public static void findnextGreaterRight(int arr[],int nextGreater[]){
        Stack<Integer> s=new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void findnextGreaterLeft(int arr[],int nextGreater[]){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void findnextSmallerRight(int arr[], int nextSmaller []){
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmaller[i]=-1;
            }
            else{
                nextSmaller[i]=arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void findnextSmallerLeft(int arr[], int nextSmaller []){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmaller[i]=-1;
            }
            else{
                nextSmaller[i]=arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        int nextGreater[]=new int[arr.length];
        int nextSmaller[]=new int[arr.length];
        //Finding the greater element in the next right
        findnextGreaterLeft(arr,nextGreater);
        printArray(nextGreater);
        //Finding the greater element in the next left
        findnextGreaterRight(arr, nextGreater);
        printArray(nextGreater);
        //Finding the smaller element in the next right
        findnextSmallerRight(arr, nextSmaller);
        printArray(nextSmaller);
        //Finding the smaller element in the next left
        findnextSmallerLeft(arr, nextSmaller);
        printArray(nextSmaller);
    }
    
}
