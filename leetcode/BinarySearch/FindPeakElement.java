package leetcode.BinarySearch;

public class FindPeakElement {
      public int findPeakElement(int[] nums) {
    int left=0,right=nums.length-1,mid=0;
    while(left<=right)
    {
        mid=(left+right)/2;
        if(mid<nums.length-1 && nums[mid]<nums[mid+1])
        {
            left=mid+1;
        }
        else
        right=mid-1;
    }
    return left;
    }
}

/*time complexity is o(logn) space is o(1) */