package String;

import java.util.Arrays;

/**
 * Created by myho on 7/11/15.
 */

/*
 * http://www.lintcode.com/en/problem/compare-strings/
 *
 * Compare two strings A and B, determine whether A contains all of the characters in B.
 */
public class CompareStrings {

    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public static boolean compareStrings(String A, String B) {

        // write your code here
        char[] sortedA = A.toCharArray();
        Arrays.sort(sortedA);

        char[] sortedB = B.toCharArray();
        Arrays.sort(sortedB);

        int index1 = 0;
        int index2 = 0;

        while(index1 < sortedA.length && index2 < sortedB.length) {
            if(sortedA[index1] != sortedB[index2]) {
                index1++;
            } else {
                index1++;
                index2++;
            }
        }

        return index2 == sortedB.length;
    }

    public static void main(String[] args) {
        System.out.println(compareStrings("ABC", "AC"));
//        System.out.println(compareStrings("ABC", ""));
    }
}
