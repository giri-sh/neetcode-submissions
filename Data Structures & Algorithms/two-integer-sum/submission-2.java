class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> out = new HashMap<>();
        int i1 = 0, i2 = 1;
        for(int i=0; i < nums.length; i++) {
            if(out.get(target - nums[i]) != null) {
                i1 = out.get(target - nums[i]);
                i2 = i;
                break;
            }
            out.put(nums[i], i);
        }
        return new int[]{i1, i2};
    }
}
