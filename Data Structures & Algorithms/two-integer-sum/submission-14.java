class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Solution 1 - Use 2 for loops to obtain the numbers. O(n2) time and O(1) space
        // Solution 2 - Sort array. Use 2 pointers and navigate the array until the sum is found. O(nlogn) time and O(1) space
        // Solution 3 - Use map and store all elements. Subtract total minus the number at index to find final value. O(n) time and space
        Map<Integer, Integer> itemMap = new HashMap<>();
        int[] resultArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (itemMap.containsKey(diff)) {
                resultArray[0] = itemMap.get(diff);
                resultArray[1] = i;
                break;
            }
            itemMap.put(nums[i], i);
        }
        return resultArray;
    }
}
