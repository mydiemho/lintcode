package String;

import java.util.*;

/**
 * Created by myho on 7/11/15.
 */
public class Anagrams {
    public static List<String> anagrams(String[] strs) {
        // write your code here
        Map<String, List<String>> anagramSet = new HashMap<>();
        for (String s : strs) {
            char[] sortedCharArray = s.toCharArray();
            Arrays.sort(sortedCharArray);
            String sortedString = new String(sortedCharArray);

            if (!anagramSet.containsKey(sortedString)) {
                anagramSet.put(sortedString, new ArrayList<String>());
            }

            anagramSet.get(sortedString).add(s);
        }

        List<String> result = new ArrayList<>();
        for (String key : anagramSet.keySet()) {
            // only add if list size is > 2;
            List<String> set = anagramSet.get(key);
            if (set.size() >= 2) {
                result.addAll(set);
            }
        }

        return result;
    }

    private static void smallTest() {
        String[] dictionary = new String[] {
                "debit card", "bad credit", "the morse code", "here come dots",
                "the eyes",   "they see",   "THL"};
        List<String> result = anagrams(dictionary);
        assert result.size() == 3;
    }

    public static void main(String[] args) {
        String[] dictionary = new String[] {
                "debit card", "bad credit", "the morse code", "here come dots",
                "the eyes",   "they see",   "THL"};
        List<String> result = anagrams(dictionary);
        System.out.print(result);
    }
}
