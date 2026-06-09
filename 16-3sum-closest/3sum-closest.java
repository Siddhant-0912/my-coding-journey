class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //int closest = Integer.MAX_VALUE; it will cause overflow as target-closest
        int closest = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
               if(Math.abs(target - sum)
                   < Math.abs(target - closest)) {

                    closest = sum;
                }
                if(sum == target){
                return target;
                }
                else if(sum<target)
                {
                    j++;
                }
                else
                {
                    k--;
                    
                }

            }

        }   
        return closest;
    }
}