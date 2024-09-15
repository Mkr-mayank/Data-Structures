public class subarray {
    public static void Max_Min(int ar[]){
        int max=ar[0];
        int min=ar[0];
        for(int i=1;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
            if(ar[i]<min){
                min=ar[i];
            }
        }
        System.out.println("Max= "+max);
        System.out.println("Min= "+min);
    }
    public static void Subarray(int ar[]){
        int n=ar.length,i,j,k;
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                for(k=i;k<=j;k++){
                    System.out.print(ar[k]+" ");
                }
                System.out.println();
                
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int ar[]={2,4,6,8,10};
        Subarray(ar);
    }
}
