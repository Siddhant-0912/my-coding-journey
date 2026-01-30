class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
     //   return bruteforce(nums,k);
          return optimal(nums,k);
        //return optimalSirway(nums,k);
    }

   /* public int[] bruteforce(int[] nums, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<=nums.length-k;i++)
        {
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++)
            {
                max=Math.max(max,nums[j]);
            }
            arr.add(max);

        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
        
    }
    time limit will exceed in this case        
    */
    
    public int[] optimal(int[] nums, int k) {
    // create result array
    int[] result=new int[nums.length-k+1];
    // create deque
    Deque<Integer> dq=new ArrayDeque<>();

    for (int i = 0; i < nums.length; i++) {
        // step 1: remove out-of-window
        if(!dq.isEmpty() && dq.peekFirst()<=i-k)
        {
            dq.removeFirst();
        }
        // step 2: remove smaller from back
        while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i])
        {
            dq.removeLast();
        }
        // step 3: add index
        dq.addLast(i);
        // step 4: store result
        if(i>=k-1)
        result[i-k+1]=nums[dq.peekFirst()];
    }

    return result;
}

   /* public int[] optimalSirway(int[] nums, int k) {
        int[] result=new int[nums.length-k+1];
        Deque<Integer> dq=new ArrayDeque<>();

        //first window
        for(int i=0;i<k;i++)
        {
            while(!dq.isEmpty()  &&  nums[dq.peekLast()]<=nums[i])
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        result[0] = nums[dq.peekFirst()];

        // 2️⃣ Slide window
        for (int i = k; i < nums.length; i++) {

            // Remove out-of-window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            // Insert new element
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.removeLast();
            }
            dq.addLast(i);

            // Store max
            result[i - k + 1] = nums[dq.peekFirst()];
        }

        return result;
    }
    in this we uses 2 loops first till element k and than 2nd for rest element so that we can directly store in resultant
    */
}




