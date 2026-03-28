class Solution {
    public boolean containsDuplicate(int[] nums) {
        int left=0;
        int fast;
        Arrays.sort(nums);
        for(fast=1;fast<nums.length;fast++)
        {
            if(nums[left]==nums[fast])
            return true;
            else
            {
                left++;
            }
        }
        return false;
    }
}