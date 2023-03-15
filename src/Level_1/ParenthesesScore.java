package Level_1;
// Score of Parentheses
//Input: s = "()()"
//Output: 2
import java.util.Stack;

public class ParenthesesScore {
    static int parenScore(String s){
        Stack<Integer> st = new Stack<>();
        int score = 0;
        for (int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(score);
                score = 0;
            }else {
                score = st.pop()+Math.max(2*score, 1);
            }
        }
        return score;
    }
    public static void main(String[] args) {
        String str = "(()(()))";
        int res = parenScore(str);
        System.out.println(res);

    }
}
