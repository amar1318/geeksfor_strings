package Level_1;

import java.util.HashMap;

//Check if two given Strings are Isomorphic to each other
//Input:  str1 = “aab”, str2 = “xxy”
//Output: True
public class IsIsomorphic {
    static boolean isIsomorphic(String s1, String s2){
        if (s1.length() != s2.length()) return false;
        HashMap<Character, Character> map = new HashMap();
        for (int i = 0; i < s1.length(); i++) {
            if (map.containsKey(s1.charAt(i))) {
               char c = map.get(s1.charAt(i));
                if (c != s2.charAt(i))
                    return false;
            }
            else if (!map.containsValue(s2.charAt(i))) {
                map.put(s1.charAt(i), s2.charAt(i));
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
