public class Array_2d {
    public static void SpiralMatrix(int matrix[][]){
        int endrow=matrix.length-1,endcol=matrix[0].length-1;
        int i=0,j=0,startrow=0,startcol=0; 
        while(startrow<=endrow && startcol<=endcol){
            //Top
            for(j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            //Right
            for(i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            //Bottom
            for(j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            //Left
            for(i=endrow-1;i>startrow;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }
    public static int DiagonalSum(int matrix[][]){
        int n=matrix.length;
        int sum=0;
        
        //Brute Force: TC- O(n^2)
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==j || (i+j)==n-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        // return sum;

        //Optimised Code: TC- O(n)
        for(int i=0;i<n;i++){
            sum+=matrix[i][i];
            if(i!=n-1-i){
                sum+=matrix[i][n-1-i];
            }
        }
        return sum;
    }
    public static void Print2dArray(int matrix[][]){
        int r=matrix.length,c=matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        // int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        Print2dArray(matrix);
        // SpiralMatrix(matrix);
        System.out.println(DiagonalSum(matrix));
    }
}
