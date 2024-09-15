import java.util.*;
public class inbuilt_sort {
    public static void main(String args[]){
        int ar1[]={4,6,2,3,9};
        int ar2[]={4,6,2,3,9};
        Integer ar3[]={4,6,2,3,9};
        Integer ar4[]={4,6,2,3,9};
        int i;
        //Ascending Order Sorting
        Arrays.sort(ar1);
        for(i=0;i<ar1.length;i++){
            System.out.print(ar1[i]+" ");
        }
        System.out.println();
        Arrays.sort(ar2,1,4); //sorting is performed between specific index range. Ending index is non inclusive
        for(i=0;i<ar2.length;i++){
            System.out.print(ar2[i]+" ");
        }
        System.out.println();
        //Descending Order Sorting
        Arrays.sort(ar3,Collections.reverseOrder());
        for(i=0;i<ar3.length;i++){
            System.out.print(ar3[i]+" ");
        }
        System.out.println();
        Arrays.sort(ar4,2,5,Collections.reverseOrder());
        for(i=0;i<ar4.length;i++){
            System.out.print(ar4[i]+" ");
        }
        System.out.println();
    }
}
