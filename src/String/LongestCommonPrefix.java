package String;

/**
 * Created by myho on 7/12/15.
 */

/*
 * http://stackoverflow.com/questions/8578349/longest-common-prefix-for-n-string
 */
public class LongestCommonPrefix {
    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0) {
            return "";
        }

        // find the length of the prefix, it cannot be longer than the shortest string
        String minString = strs[0];
        for(String s : strs)
        {
            if(s.length() < minString.length()) {
                minString = s;
            }
        }

        int maxLength = minString.length();
        for(String s : strs){
            int j = 0;
            for(; j < maxLength; j++)
            {
               // check to see if there's a prefix less than maxLength
                if(s.charAt(j) != minString.charAt(j)) {
                    break;
                }
            }

            maxLength = Math.min(maxLength, j);
        }

        return minString.substring(0, maxLength);
    }

    public static void main(String[] args)
    {

    }
}
