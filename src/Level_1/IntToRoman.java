package Level_1;
//Converting Decimal Number lying between 1 to 3999 to Roman Numerals
//Input : 9
//Output : IX
public class IntToRoman {
    static void intToRoman(int num){
        int [] integers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        while (num>0){
            for (int i=0; i<integers.length; i++){
                if (num>=integers[i]){
                    result.append(roman[i]);
                    num-=integers[i];
                    break;
                }
            }
        }
        System.out.println(result.toString());
    }
    public static void main(String[] args) {
        int number = 50;
        intToRoman(number);

    }
}
