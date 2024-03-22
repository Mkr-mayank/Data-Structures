import java.util.*;
public class Decode_String {
    public static String Decode(String str){
        Stack<Integer> intstack=new Stack<>();
        Stack<Character> strstack=new Stack<>();
        String temp="";
        String result="";
        for(int i=0;i<str.length();i++){
            int count=0;
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                while(Character.isDigit(ch)){
                    count=count*10+ch-'0';
                    i++;
                }
                i--;
                intstack.push(count);
            }
            else if(ch==']'){
                temp="";
                count=0;
                if(!intstack.isEmpty()){
                    count=intstack.peek();
                    intstack.pop();
                }
                while(!strstack.isEmpty() && strstack.peek()!='['){
                    temp=strstack.peek()+temp;
                    strstack.pop();
                }
                if(!strstack.isEmpty() && strstack.peek()=='['){
                    strstack.pop();
                }
                for(int j=0;j<count;j++){
                    result+=temp;
                }
                for(int j=0;j<result.length();j++){
                    strstack.push(result.charAt(j));
                }
                result="";
            }
            else if(ch=='['){
                if(Character.isDigit(str.charAt(i-1))){
                    strstack.push(ch);
                }
                else{
                    strstack.push(ch);
                    intstack.push(1);
                }
            }
            else{
                strstack.push(ch);
            }
        }
        while(!strstack.isEmpty()){
            result=strstack.pop()+result;
        }
        return result;
        
    }
    public static void main(String args[]){

        String str="3[b2[ca]]";
        System.out.println(Decode(str));
    }
}
