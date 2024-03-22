public class Keypad_Combinations {
    static final char L[][]={{},{},{'a','b','c'},{'d','e','f'},
                        {'g','h','i'},{'j','k','l'},{'m','n','o'},
                        {'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
    public static void letterCombination(String key){
        int len=key.length();
        if(len==0){
            System.out.println("");
            return;
        }
        bfs(0,len,new StringBuilder(),key);
    }
    public static void bfs(int pos,int len,StringBuilder sb,String key){
        if(pos==len){
            System.out.print(sb.toString()+" ");
        }
        else{
            char letters[]=L[Character.getNumericValue(key.charAt(pos))];
            for(int i=0;i<letters.length;i++){
                bfs(pos+1,len,new StringBuilder(sb).append(letters[i]),key);
            }
        }
    } 
    public static void main(String args[]){
        letterCombination("9");
    }
}
