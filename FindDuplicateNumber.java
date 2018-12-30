class Solution {
    public int findDuplicate(int[] nums) {
        for (int i=0;i<nums.length;i++) {
            int p = Math.abs(nums[i]);
            if (nums[p-1] < 0) return p;
            else nums[p-1] = -nums[p-1];
        }
        return -1;
    }
}
