class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Use set to check if we have encountered previous num
        // Use map to keep count. Any count > 1
        Set<Integer> uniqueValues = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            if (uniqueValues.contains(nums[i])) {
                return true;
            } else {
                uniqueValues.add(nums[i]);
            }
        }
        return false;
    }
}