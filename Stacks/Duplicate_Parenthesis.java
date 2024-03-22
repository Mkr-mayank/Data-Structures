import java.util.*;
public class Duplicate_Parenthesis {
    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();
        int count;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //Closing
            if(ch==')'){
                count=0;
                while(s.pop()!='('){
                    count++;
                }
                if(count<1){
                    return true;
                }
            }
            //Opening
            else{
                s.push(ch);
            }
        }
        return false;    
    }
    public static void main(String args[]){
        String str="(((a+(b))+(c+d)))";
        String str1="((a+b)+(c+d)";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str1));
    }
}
