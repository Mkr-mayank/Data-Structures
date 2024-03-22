public class AllPossibleNKnights {
    static int count=0;
    public static void NKnights(char board[][],int row){
        //base case
        if(row==board.length){
            // PrintChessBoard(board);
            count++;
            return;
        }
        //recursion
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='K';
                NKnights(board, row+1);
                board[row][j]='.';
            }
            
        }
    }
    public static boolean isSafe(char board[][],int row,int col){
        //1 left 2 up
        for(int i=row,j=col;i>=2 && j>=1;i--,j--){
            if(board[i-2][j-1]=='K'){
                return false; 
            }
        }
        //2 left 1 up
        for(int i=row,j=col;i>=1 && j>=2;i--,j--){
            if(board[i-1][j-2]=='K'){
                return false; 
            }
        }
        //1 right 2 up
        for(int i=row,j=col;i>=2 && j<board.length-1;i--,j++){
            if(board[i-2][j+1]=='K'){
                return false; 
            }
        }
        //2 right 1 up
        for(int i=row,j=col;i>=1 && j<board.length-2;i--,j++){
            if(board[i-1][j+2]=='K'){
                return false; 
            }
        }
        return true;
    
    }
    public static void PrintChessBoard(char board[][]){
        System.out.println("-------------Chessboard----------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=8;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        // PrintChessBoard(board);
        NKnights(board,0);
        System.out.println("No of solutions="+count);
    }
}
