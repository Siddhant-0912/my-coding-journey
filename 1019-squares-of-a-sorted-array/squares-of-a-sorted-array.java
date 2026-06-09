class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int i=nums.length-1;
        int[] result=new int[nums.length];
        while(left<=right)
        {
            if(Math.pow(nums[left],2)<Math.pow(nums[right],2)){
            result[i]=nums[right]*nums[right];
            right--;
            }
            else{
            result[i]=nums[left]*nums[left];
            left++;
            }

            i--;
        }
        return result;


        
    }
}