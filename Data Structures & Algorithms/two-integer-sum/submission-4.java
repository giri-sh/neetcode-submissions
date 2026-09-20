class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Solution 1 - Use 2 for loops to obtain the numbers. O(n2) time and O(1) space
        // Solution 2 - Sort array. Use 2 pointers and navigate the array until the sum is found. O(nlogn) time and O(1) space
        // Solution 3 - Use map and store all elements. Subtract total minus the number at index to find final value. O(n) time and space
        Map<Integer, Integer> items = new HashMap<>();
        int arrSize = nums.length - 1;
        for (int i = 0; i <= arrSize; i++) {
            items.put(nums[i], i);
        }
        int i = 0, j = 1;
        for (; i <= arrSize; i++) {
            if (items.get(target - nums[i]) != null && items.get(target - nums[i]) != i) {
                j = items.get(target - nums[i]);
                break;
            }
        }
        return new int[]{i, j};
    }
}
