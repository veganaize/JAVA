/**
 * Given an array of integers nums and
 * an integer target, return indices of
 * the two numbers such that they add up
 * to target.
 *
 * You may assume that each input would
 * have exactly one solution, and you
 * may not use the same element twice.
 */


class BruteIterativeSolution {

    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];

        for (int i = 0;; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    array[0] = i; array[1] = j;
                    return array;
                }
            }
        }
    }
}
