import java.util.*;
public class spiral_matrix {
    public static void SpiralMatrix(int ar[][]){
        int i,j;
        int startrow=0;
        int endrow=ar.length-1;
        int startcol=0;
        int endcol=ar[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //top
            for(j=startcol;j<=endcol;j++){
                System.out.print(ar[startrow][j]+" ");
            }           
            //right
            for(i=startrow+1;i<=endrow;i++){
                System.out.print(ar[i][endcol]+" ");
            } 
            //bottom
            for(j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(ar[endrow][j]+" ");
            }
            //left
            for(i=endrow-1;i>startrow;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(ar[i][startcol]+" ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }
    public static void creatematrix(int ar[][]){
        int i,j,r=ar.length,c=ar[0].length;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                ar[i][j]=sc.nextInt();
            }
        }
    }
    public static void PrintMatrix(int ar[][]){
        int i,j,r=ar.length,c=ar[0].length;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
        PrintMatrix(matrix);
        SpiralMatrix(matrix);
    }    
}
