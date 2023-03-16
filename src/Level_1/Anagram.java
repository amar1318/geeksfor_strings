package Level_1;

import java.util.Arrays;

//242. Valid Anagram
//Input: s = "anagram", t = "nagaram"
//Output: true
public class Anagram {
    static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) return false;

        char [] sc = s.toCharArray();
        char [] tc = t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);

        for (int i=0; i< sc.length; i++){
            if (sc[i] != tc[i]){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        if (isAnagram(s, t)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}
