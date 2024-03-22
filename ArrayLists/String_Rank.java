public class String_Rank{
    public static int rank=0;
    public static void PossibleString(String input,String curr,int N,int R) {
        int len=input.length();
        if (N<1 || N>len) {
            System.out.println("Invalid value of 'N'. Please enter a value between 1 and " + len);
            return;
        }
        if (curr.length()==N) {
            rank++;
            if(rank==R){
                System.out.println(curr);
                return;
            }
            return;
        }

        for (int i=0;i<input.length();i++) {
            if (!curr.contains(String.valueOf(input.charAt(i)))) {
                PossibleString(input,curr+input.charAt(i),N,R);
            }
        }
    }

    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuvwxyz";
        int N=2;
        int R=200;
        PossibleString(str,"",N,R);
    }
}
