public class findPermutations {
    public static void calPermutations(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //Recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            calPermutations(newStr,ans+curr);
        }
    }
    public static void main(String args[]){
        calPermutations("abc","");
    }
}
