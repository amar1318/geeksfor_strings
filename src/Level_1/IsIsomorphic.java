package Level_1;

import java.util.HashMap;

//Check if two given Strings are Isomorphic to each other
//Input:  str1 = “aab”, str2 = “xxy”
//Output: True
public class IsIsomorphic {
    static boolean isIsomorphic(String s1, String s2){
        if (s1.length() != s2.length()) return false;
        HashMap<Character, Character> charCount = new HashMap();
        //char c = 'a';
        for (int i = 0; i < s1.length(); i++) {
            if (charCount.containsKey(s1.charAt(i))) {
               char c = charCount.get(s1.charAt(i));
                if (c != s2.charAt(i))
                    return false;
            }
            else if (!charCount.containsValue(s2.charAt(i))) {
                charCount.put(s1.charAt(i), s2.charAt(i));
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "xxy";
        if (isIsomorphic(str1, str2)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}
