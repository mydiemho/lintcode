package String;

/**
 * Created by myho on 7/11/15.
 */

/*
 * http://www.lintcode.com/en/problem/longest-common-substring/
 *
 * Given two strings, find the longest common substring.
 */
public class LongestCommonSubstring {
    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public static int longestCommonSubstring(String A, String B) {
        int[][] table = new int[A.length() + 1][B.length() + 1];

        int maxLength = 0;

        // index 0 is just dummy data
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                char a = A.charAt(i);
                char b = B.charAt(j);
                if (A.charAt(i) == B.charAt(j)) {
                    int length = table[i][j] + 1;
                    table[i + 1][j + 1] = length;
                    maxLength = Math.max(length, maxLength);
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonSubstring("www.lintcode.com code", "www.ninechapter.com code"));
        System.out.println(longestCommonSubstring("abcd", "bce"));
//        System.out.println(longestCommonSubstring("bce", "abcd"));
    }
}

