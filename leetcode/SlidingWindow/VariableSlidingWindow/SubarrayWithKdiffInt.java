package leetcode.SlidingWindow.VariableSlidingWindow;

import java.util.HashMap;

public class SubarrayWithKdiffInt {
     public int subarraysWithKDistinct(int[] nums, int k) {
        return countWithK(nums, k) - countWithK(nums, k - 1);
    }
    public int countWithK(int[] nums, int k) {
        int left=0,count=0,d=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
                d++;
                
            }
            else{
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
        }
            while(d>k)
            {
                map.put(nums[left],map.getOrDefault(nums[left],0)-1);
                if(map.get(nums[left])==0)
                { map.remove(nums[left]);
                d--;
               }
                 left++;
            }
            count += i - left + 1;
        }
        return count;
    }
}
