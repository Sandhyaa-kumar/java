public class NumberOfSubarraysWithBoundedMaximum {
      public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int current=0,lastInvalid=-1,count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>right)
            {
                current=0;
                lastInvalid=i;
            }
            else if (nums[i]>=left)
            {
                current=i-lastInvalid;
                count+=current;
            }
            else
            count+=current;
        }
        return count;
    }
}
