package Level_1;
//Converting Roman Numerals to Decimal lying between 1 to 3999
//Input: MCMIV
//Output: 1904
public class RomanToInt {
    static void romanInt(String s){
        String symbols = "IVXLCDM";
        int [] values = {1, 5, 10, 50, 100, 500, 1000};

        int ans = 0;
        int prev = -1;
        for(int i=s.length()-1; i>=0; i--){
            int curr = symbols.indexOf(s.charAt(i));   //returns the index of symbols
            if(curr<prev){
                ans -= values[curr];
            }else {
                ans +=values[curr];
            }prev=curr;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String str = "MCM";
        romanInt(str);
    }
}
