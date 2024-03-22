import java.util.*;
//Implementing Stack using Java Collection Framework
public class StackUsingJCF {
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(4);
        s.push(2);
        s.push(7);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
