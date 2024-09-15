public class diagonal_sum {
    public static void DiagonalSum(int ar[][]){
        // This is a Brute Force Approach where Time Complexity is O(n^2).
        //This signifies that the code is not highly optimised.
        // int i,j,r=ar.length,c=ar[0].length,sum=0;
        // for(i=0;i<r;i++){
        //     for(j=0;j<c;j++){
        //         if(i==j){
        //             sum+=ar[i][j];
        //         }
        //         if(i+j==ar.length-1){
        //             sum+=ar[i][j];
        //         }
        //     }
        // }
        int i,sum=0;
        for(i=0;i<ar.length;i++){
            //pd
            sum+=ar[i][i];
            //sd 
            //if condition omits the overlaping of element
            if(i!=ar.length-1-i){
                sum+=ar[i][ar.length-1-i];
            }
        }
        System.out.println("The diagonal sum is: "+sum);
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        DiagonalSum(matrix);
    }
    
}
