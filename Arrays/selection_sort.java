public class selection_sort {
    public static void Selection_Sort(int ar[]){
        int i,j,n=ar.length,minpos;
        for(i=0;i<n-1;i++){
            minpos=i;
            for(j=i+1;j<n;j++){
                if(ar[minpos]>ar[j]){
                    minpos=j;
                }
            }
            int temp=ar[i];
            ar[i]=ar[minpos];
            ar[minpos]=temp;
        }
    }
    public static void PrintArray(int ar[]){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int ar[]={5,4,1,8,3};
        Selection_Sort(ar);
        PrintArray(ar);
    }
}
