public class findSubset {
    public static void calSubsets(String str,StringBuilder ans, int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans.toString());
            }
            return;
        }
        //Recursion
        ans.append(str.charAt(i));
        calSubsets(str,ans,i+1); //YES
        ans.deleteCharAt(ans.length()-1);
        calSubsets(str,ans,i+1); //NO
        
    }
    public static void main(String args[]){
        StringBuilder ans=new StringBuilder();
        calSubsets("abc",ans,0);
    }    
}
