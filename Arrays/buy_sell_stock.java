import java.util.*;
public class buy_sell_stock {
    public static int Stock(int prices[]){
        int n=prices.length,i,maxprofit=0,profit;
        int bp=Integer.MAX_VALUE;
        for(i=0;i<n;i++){
            bp=Math.min(prices[i],bp);
            if(bp<prices[i]){ //profit
                profit=prices[i]-bp; //today's profit
                maxprofit=Math.max(profit,maxprofit); 
            }
            else{ //no profit
                bp=prices[i];
            } 
        }
        return maxprofit;
    }
    public static void main(String args[]){
        // int prices[]={9,5,6,7,20,18};
        // int prices[]={142,141,149,149,146,150,152,152,153,156,163,165,164,164};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        System.out.println(Stock(prices));
    }
    
}
