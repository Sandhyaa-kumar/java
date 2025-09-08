public class MaxConsecutiveOnes3 {
      public int longestOnes(int[] nums, int k) {
        int left = 0, zeros = 0, ans = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeros++;

            while (zeros > k) {
                if (nums[left] == 0) zeros--;
                left++;
            }
            
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
   /*HashMap<Integer,Integer> map = new HashMap<>();
      int left=0,count=0,ans=0;
      for(int i=0;i<nums.length;i++)
      {
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        if(nums[i]==0) count++;
        while(count>k)
        { 
            map.put(nums[left],map.get(nums[left])-1);
            if(nums[left]==0) count--;
            if(map.get(nums[left])==0) map.remove(nums[left]);
            left++;
        }
        ans=Math.max(ans,i-left+1);
      }  
      return ans;
    }
}*/