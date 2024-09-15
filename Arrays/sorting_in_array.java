public class sorting_in_array {
    public static void Bubble_Sort(int ar[]){
        int i,j,n=ar.length;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
    }
    public static void Selection_Sort(int ar[]){
        int i,j,n=ar.length,minindex;
        for(i=0;i<n-1;i++){
            minindex=i;
            for(j=i+1;j<n;j++){
                if(ar[minindex]>ar[j]){
                    minindex=j;
                }
            }
            int temp=ar[i];
            ar[i]=ar[minindex];
            ar[minindex]=temp;
        }
    }
    public static void Insertion_Sort(int ar[]){
        int i,curr,preind,n=ar.length;
        for(i=1;i<n;i++){
            curr=ar[i];
            preind=i-1;
            while(preind>=0 && (ar[preind]>curr)){
                ar[preind+1]=ar[preind];
                preind--;
            }
            ar[preind+1]=curr;
        }
    }
    public static void Counting_Sort(int ar[]){
        int i,j,n=ar.length,largest=Integer.MIN_VALUE;
        for(i=0;i<n;i++){
            largest=Math.max(ar[i],largest);
        }
        int count[]=new int[largest+1];
        for(j=0;j<n;j++){
            count[ar[j]]++;
        }
        j=0;
        for(i=0;i<count.length;i++){
            while(count[i]>0){
                ar[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void PrintArray(int ar[]){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int ar[]={3,6,1,7,2};
        PrintArray(ar);
        Counting_Sort(ar);
        PrintArray(ar);
    }
}
