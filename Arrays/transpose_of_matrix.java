public class transpose_of_matrix {
    public static void Transpose(int ar[][]){
        int r=ar.length,c=ar[0].length;
        //transpose
        int transpose[][]=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                transpose[j][i]=ar[i][j];
            }
        }
        printmatrix(transpose);
    }
    public static void printmatrix(int ar[][]){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][]={{4,6,1},
                        {3,7,9}};
        printmatrix(matrix);
        System.out.println();
        Transpose(matrix);
    }
}
