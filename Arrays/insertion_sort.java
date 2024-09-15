public class insertion_sort{
    public static void Insertion_Sort(int ar[]){
        int i,n=ar.length;
        for(i=1;i<n;i++){
            int curr=ar[i];
            int prev=i-1;
            while(prev>=0 && ar[prev]>curr){
                ar[prev+1]=ar[prev];
                prev--;
            }
            ar[prev+1]=curr;
        }
    }
    public static void Printarray(int ar[]){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }

    }
    public static void main(String args[]){
        int ar[]={2,5,7,1,4};
        Insertion_Sort(ar);
        Printarray(ar);
    }
}