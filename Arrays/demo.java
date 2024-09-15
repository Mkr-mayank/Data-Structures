public class demo{
    public static void PrintArray(int ar[]){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        // Searching s1=new Searching();
        // int ar[]={1,5,7,9};
        // s1.BinarySearch(ar, 4);
        Sorting s2=new Sorting();
        int ar1[]={13,1,9,5,7};
        s2.BubbleSort(ar1);
    }
}
class Searching{
    void LinearSearch(int ar[],int ele){
        for(int i=0;i<ar.length;i++){
            if(ar[i]==ele){
                System.out.println("Element found at index "+i);
                return;
            }
        }
        System.out.println("Element not found");
    }
    void BinarySearch(int ar[],int ele){
        int low=0;
        int high=ar.length-1;
        int mid;
        while(low<=high){
            mid=(high+low)/2;
            if(ar[mid]==ele){
                System.out.println("Element found at index "+mid);
                return;
            }
            else if(ar[mid]<ele){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println("Element not found");
    }
}
class Sorting extends demo{
    void BubbleSort(int ar[]){
        int n=ar.length;
        PrintArray(ar);
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(ar[j+1]<ar[j]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        PrintArray(ar);
    }
}