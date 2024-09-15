public class bubble_sort {
    public static void Bubble_Sort(int ar[]){
        int i,j,n=ar.length,temp,swap=0;
        for(i=0;i<n-1;i++){
            for(j=0;j<(n-i-1);j++){
                if(ar[j]>ar[j+1]){
                    swap++;
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
            if(swap==0){
                break;
            }
        }
        // System.out.println(swap);
        System.out.print("After performing Bubble Sort the sorted array is: ");
        for(i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String args[]){
        int ar[]={1,9,7,2,4};
        Bubble_Sort(ar);
    }
}
