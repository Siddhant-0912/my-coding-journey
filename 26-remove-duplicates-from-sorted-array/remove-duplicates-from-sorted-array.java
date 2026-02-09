class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
        return 0;
        int slow=0;
        int fast;
        for(fast=0;fast<nums.length;fast++)
        {
            if(nums[slow]!=nums[fast])
            {
                nums[slow+1]=nums[fast];
                slow++;
            }
        }
        int k=slow+1;
        return k;
   
        
    }
}