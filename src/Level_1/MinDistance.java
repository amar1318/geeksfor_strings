package Level_1;
//Find the minimum distance between the given two words
//Input: S = { “the”, “quick”, “brown”, “fox”, “quick”}, word1 = “the”, word2 = “fox”
//Output: 3
public class MinDistance {
    static void minDistance(String[] words, String word1, String word2){
        int i1 = -1;
        int i2 = -1;
        int mindist = Integer.MAX_VALUE;
        for (int i=0; i< words.length; i++){
            if(words[i].equals(word1)){
                i1 = i;
            }if (words[i].equals(word2)){
                i2 = i;
            }
            if (i1 != -1 && i2 != -1){
                mindist = Math.min(mindist, Math.abs(i1-i2));
            }
        }
        System.out.println(mindist);
    }

    public static void main(String[] args) {
        String[] strArr = {"the", "quick", "brown", "fox", "quick"};
        String word1 = "the";
        String word2 = "fox";
        minDistance(strArr, word1, word2);
    }
}
