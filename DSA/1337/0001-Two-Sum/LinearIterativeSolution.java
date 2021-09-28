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

import java.util.HashMap;


class LinearIterativeSolution {

    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        HashMap<Integer, Integer> hashmap = new HashMap<>(nums.length/2 <= 16 ?
                                      nums.length : nums.length/2);

        for (int i = 0;; i++) {
            /* Index of other addend already in hashmap ? */
            if (hashmap.containsKey(nums[i])) {
                results[0] = hashmap.get(nums[i]);
                results[1] = i;
                return results;
            }

            /* Index of current addend NOT yet in hashmap ? */
            if (!hashmap.containsKey(target-nums[i])) {
                hashmap.put(target-nums[i], i);
            } else {
            /* Index of current addend already in hashmap */
                /* Doubling addend equals target ? */
                if (target == nums[i] * 2) {
                    results[0] = hashmap.get(target-nums[i]);
                    results[1] = i;
                    return results;
                }
            }
        }
    }
}
