package String;

import java.util.Arrays;

/**
 * Created by myho on 7/12/15.
 */

/*
 * http://www.lintcode.com/en/problem/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates {

    /*
     * http://www.programcreek.com/2013/01/leetcode-remove-duplicates-from-sorted-array-java/
     */
    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        // sort the array
        Arrays.sort(nums);

        // number of unique characters
        int count = 1;

        int i = 0;
        int j = 1;

        // j will always be at least one ahead of i
        // if j is more than one ahead of i, there are duplicates of i
        while (j < nums.length) {
            // needs to either do a replacement or not depends on if this is the first time seeing
            // the character
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                // move both pointer forward
                nums[i] = nums[j];
                j++;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {-10, 0, 1, 2, 3};
        System.out.println(removeDuplicates(nums));
        System.out.println((Arrays.toString(nums)));
    }
}
