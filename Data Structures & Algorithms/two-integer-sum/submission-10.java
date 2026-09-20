class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Solution 1 - Use 2 for loops to obtain the numbers. O(n2) time and O(1) space
        // Solution 2 - Sort array. Use 2 pointers and navigate the array until the sum is found. O(nlogn) time and O(1) space
        // Solution 3 - Use map and store all elements. Subtract total minus the number at index to find final value. O(n) time and space
        int arrSize = nums.length;
        Map<Integer, Integer> items = new HashMap<>();
        for (int i = 0; i <= arrSize - 1; i++) {
            items.put(nums[i], i);
        }
        Integer i = 0, j = 1;
        for (; i <= arrSize - 1; i++) {
            j = items.get(target - nums[i]);
            if (j != null && i != j) {
                break;
            }
        }
        return new int[]{i, j};
    }
}
