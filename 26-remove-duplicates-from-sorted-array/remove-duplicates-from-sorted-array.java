class Solution {
    public int removeDuplicates(int[] nums) {
        int fast=0;
        int slow=0;
        while(fast<=nums.length-1)
        {
            if(nums[slow]==nums[fast])
            fast++;
            else{
            nums[slow+1]=nums[fast];
            slow++;
            fast++;
            }
        }
        return slow+1;
    }
}