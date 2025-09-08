public class ShortesSubarrayWithSumAtLeastK {
    public int shortestSubarray(int[] nums, int k) {
        int start=0,sum=0,minlen=Integer.MAX_VALUE;
        for(int end=0;end<nums.length;end++)
        {
            sum=sum+nums[end];
            while(sum>k)
            {
                
                sum=sum-nums[start];
                start++;
                minlen=Math.min(minlen,end-start+1);
            }
            if (sum==k)
            minlen=end-start+1;
        }
    if(minlen!=Integer.MAX_VALUE)
    return minlen;
    else
    return -1;
    }
}
