package Level_1;

public class ReverseWords {
    static void reverse(String s){
        String [] sArr = s.split(" ");
        String ans = "";
        for(int i=sArr.length-1; i>=0; i--){
            ans+= sArr[i] + " ";
        }
        System.out.println(ans.substring(0, ans.length()-1));

    }
    public static void main(String[] args) {
        String str = "judge a book by its cover";
        reverse(str);
    }
}
