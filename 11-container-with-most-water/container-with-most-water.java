class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int area=0;
        while(left<right)
        {
            if(height[left]<=height[right])
            {
                int d=height[left]*(right-left);
                area=Math.max(area,d);
                left++;
            }
            else
            {
                int d=height[right]*(right-left);
                area=Math.max(area,d);
                right--; 
            }
        }
        return area;
    }
}