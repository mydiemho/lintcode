package String;

/**
 * Created by myho on 7/10/15.
 */
public class Anagram {
    /**
     * @param s: The first string
     * @param t: The second string
     * @return true or false
     */
    public static boolean anagram2(String s, String t) {
        // write your code here
        if(s.length() != t.length()) {
            return false;
        }

        return sort(s).equals(sort(t));
    }

    private static String sort(String s)
    {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    public static boolean anagram(String s, String t) {
        // write your code here
        if(s.length() != t.length()) {
            return false;
        }

        // ASSUMPTION: character set is ascii
        int[] chars = new int[256];

        char[] sArray = s.toCharArray();
        for(char c : sArray){
            chars[c]++;
        }

        char[] tArray = t.toCharArray();
        for(char c : tArray) {
            if(--chars[c] < 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args)
    {
        System.out.println(anagram("dog", "god"));
    }
}
