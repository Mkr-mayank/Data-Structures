import java.util.ArrayList;
public class Beautiful_Arraylist {
    public static ArrayList<Integer> PrintBeautifulList(int n){
        ArrayList<Integer> res=new ArrayList<>();
        res.add(1);
        for(int i=2;i<=n;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            //For Even Elements
            for(Integer e:res){
                if((2*e)<=n){
                    temp.add(e*2);
                }
            }
            //For Odd Elements
            for(Integer e:res){
                if((2*e-1)<=n){
                    temp.add(e*2-1);
                }
            }
            res=temp;
        }
        return res;
    }
    public static void main(String args[]){
        System.out.println(PrintBeautifulList(5));
    }
}
