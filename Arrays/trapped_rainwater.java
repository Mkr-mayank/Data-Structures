public class trapped_rainwater {
    public static void Trapped_rainwater(int ar[]){
        int n=ar.length,i,j,water_lvl,trap=0,width=1;
        int lt_max[]=new int[n];
        int rt_max[]=new int[n];
        lt_max[0]=ar[0];
        rt_max[n-1]=ar[n-1];
        for(i=1,j=n-2;i<n && j>=0;i++,j--){
            lt_max[i]=Math.max(ar[i],lt_max[i-1]);
            rt_max[j]=Math.max(ar[j],rt_max[j+1]);
        }
        for(i=0;i<n;i++){
            water_lvl=Math.min(lt_max[i],rt_max[i]);
            trap+=(water_lvl-ar[i])*width;
        }
        System.out.println("The area of trapped water="+trap);
        
    }
    public static void main(String args[]){
        int ar[]={4,2,0,6,3,2,5};
        Trapped_rainwater(ar);
    }
}
