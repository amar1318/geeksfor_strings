package Level_1;

import java.util.HashSet;
import java.util.Set;

//Check if given String is Pangram or not
//Input: “The quick brown fox jumps over the lazy dog”
//Output: is a Pangram
//*** Explanation: Contains all the characters from ‘a’ to ‘z’]
public class IsPanagram {
    static boolean isPanagram(String s){
        Set<Character> set = new HashSet<>();
        for(char ch:s.toCharArray()){
            if (ch>='a' && ch<='z'){
                set.add(ch);
            }
            if (ch>='A' && ch<='Z'){
                ch = Character.toLowerCase(ch);
                set.add(ch);
            }
        }
        return set.size() == 26;
    }
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        if (isPanagram(str)){
            System.out.println("is panagram");
        }else {
            System.out.println("Not panagram");
        }
    }
}
