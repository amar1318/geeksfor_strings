package Level_1;
//Minimum number of deletions to make a string palindrome
//Input : aebcbda
//Output : 2
//Remove characters 'e' and 'd', Resultant string will be 'abcba' which is a palindromic string
public class MinDeletion {
    public static int minDeletions(String s) {
        int[][] matrix = new int[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    matrix[i][j] = matrix[i+1][j-1];
                } else {
                    matrix[i][j] = 1 + Math.min(matrix[i+1][j], matrix[i][j-1]);
                }
            }
        }
        return matrix[0][s.length()-1];
    }

    public static void main(String[] args) {
        String str = "abcdba";              //*abcba or *abdba  --id we delete one char(d/c) then string will be palindromic
        int res = minDeletions(str);
        System.out.println(res);
    }
}
