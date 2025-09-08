public class MinimumSizeSubarraySum {
      public int minSubArrayLen(int target, int[] nums) {
        int start=0,end=0,sum=0,min=Integer.MAX_VALUE;
        for(end=0;end<nums.length;end++){
            sum=sum+nums[end];
            while(sum>=target){
                 min = Math.min(min, end - start + 1);  
                sum=sum-nums[start];
                start++;
            }}
      
        
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
