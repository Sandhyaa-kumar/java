import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
     public int characterReplacement(String s, int k) {
        int ans=0,count=0;
        int left=0;
        HashMap<Character,Integer> map =  new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            count=Math.max(count,map.get(ch));
        
            while((i - left + 1)-count>k)
            {
               char c = s.charAt(left);
               map.put(c,map.get(c)-1);
               if(map.get(c)==0) map.remove(c);
                left++;
            }
                ans=Math.max(ans,(i - left + 1));
        }
        return ans;
    }
}
/*
  int[] count = new int[26]; // store count of each letter
        int ans = 0, maxCount = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            // if replacements needed > k, shrink window
            while ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}*/
