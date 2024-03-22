public class ChangeArrayValue{
    public static void ChangeArr(int ar[],int i,int val){
        //Base Case
        if(i==ar.length){
            PrintArr(ar);
            return;
        }
        //Recursion
        ar[i]=val;
        ChangeArr(ar, i+1, val+1); 
        ar[i]-=2; //Backtracking
    }
    public static void PrintArr(int ar[]){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int ar[]=new int[5];
        ChangeArr(ar, 0, 1);
        PrintArr(ar);
    }
}