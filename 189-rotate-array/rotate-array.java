class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int x=nums.length-k-1;// to find the index from where we have to rotate
        reverse(nums,0,x);
        reverse(nums,x+1,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    void reverse(int[] nums,int start , int end)
    {
        while(start<=end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

    }
}