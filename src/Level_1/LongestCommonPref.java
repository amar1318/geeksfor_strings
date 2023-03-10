package Level_1;

import java.util.Arrays;

//Longest Common Prefix using Sorting
//Input: {"flower","flow","flight"}
//Output: “fl”
public class LongestCommonPref {
    static String commonPref(String[] s){
        Arrays.sort(s);
        String first = s[0];
        String last = s[s.length-1];
        int pref = 0;
        while (pref<first.length()){
            if(first.charAt(pref) == last.charAt(pref)){
                pref++;
            }else break;
        }return pref == 0 ? "" : first.substring(0, pref);
    }

    public static void main(String[] args) {
        String[] str={"flower","flow","flight"};
        String res = commonPref(str);
        System.out.println(res);
    }
}

//another method --without sorting

//
//    public String CommonPref(String[] strs) {
//        if(strs.length == 0) return "";
//        String pref = strs[0];
//        for(int i=1; i< strs.length; i++ ) {
//            while(strs[i].indexOf(pref) != 0) {
//                pref = pref.substring(0, pref.length()-1);
//            }
//        }
//
//        return pref;
//    }
//
