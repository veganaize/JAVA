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


class SolutionTest {

    public static void main(String[] args) {
        int target;

        int[] nums1 = {2, 7, 11, 15}; target = 9;  // {0, 1}
        test(nums1, target);

        int[] nums2 = {3, 2, 4}; target = 6;  // {1, 2}
        test(nums2, target);

        int[] nums3 = {3, 3}; target = 6;  // {0, 1}
        test(nums3, target);
    }


    static void test(int[] nums, int target) {
        int[] results;

        results = new BruteIterativeSolution().twoSum(nums, target);
        System.out.println(results[0] +", "+ results[1]);

        results = new LinearIterativeSolution().twoSum(nums, target);
        System.out.println(results[0] +", "+ results[1]);
    }

}
