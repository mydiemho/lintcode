package String;

/**
 * Created by myho on 7/11/15.
 */

/*
 * http://www.lintcode.com/en/problem/strstr/
 *
 * For a given source string and a target string, you should output the first index(from 0) of target string in source string.
 * If target does not exist in source, just return -1.
 */
public class StrStr {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public static int strStr(String source, String target) {

        if(source == null || target == null) {
            return - 1;
        }

        //write your code here
        for(int i = 0; i <= source.length() - target.length(); i++){
            if(foundString(source.substring(i, target.length()), target)) {
                return i;
            }
        }

        return -1;
    }

    private static boolean foundString(String source, String target)
    {
        for(int i = 0; i < source.length(); i++) {
            if(source.charAt(i) != target.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
//        System.out.println(strStr("abcdabcdefg", "bcd"));
//        System.out.println(strStr("ab", ""));
        System.out.println(strStr("", ""));
    }
}
