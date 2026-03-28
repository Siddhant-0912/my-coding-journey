class Solution {
    public int removeDuplicates(int[] nums) {
        int slow=0;
        int fast;
        for(fast=1;fast<nums.length;fast++)
        {
            if(nums[slow]!=nums[fast])
            {
                nums[slow+1]=nums[fast];
                 slow++;
            }
           
        }
        return slow+1;
    }
}