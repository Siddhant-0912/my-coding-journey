class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int[] result=new int[nums.length];
        int i = nums.length - 1;

        while(left <= right)

        {
            if(Math.pow(nums[left],2)>Math.pow(nums[right],2))
            {
            result[i]=nums[left]*nums[left];
            left++;
            }
            else{
            result[i]=nums[right]*nums[right];
            right--;
            }
            i--;
        }
        return result;

        
    }
}