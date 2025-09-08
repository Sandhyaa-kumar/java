import java.util.HashMap;
import java.util.HashSet;

public class MaximumOccurencesOfSubstring {
   public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<String, Integer> freq = new HashMap<>();
        int ans = 0;

        for (int i = 0; i + minSize <= s.length(); i++) {
            String sub = s.substring(i, i + minSize);
            HashSet<Character> set = new HashSet<>();
            for (char c : sub.toCharArray()) set.add(c);

            if (set.size() <= maxLetters) {
                freq.put(sub, freq.getOrDefault(sub, 0) + 1);
                ans = Math.max(ans, freq.get(sub));
            }
        }

        return ans;
    }  
}
/*class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap <Character,Integer> map = new HashMap<>();
     HashMap <String,Integer> map1 = new HashMap<>();
        int left=0,d=0,ans=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            while(map.size()>maxLetters || (i - left + 1) > maxSize)
            {
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0) map.remove(s.charAt(left));
                 left++;
            }
           if (i - left + 1 >= minSize) {
                String str = s.substring(i - minSize + 1, i + 1);
                map1.put(str, map1.getOrDefault(str, 0) + 1);
            }
        }
            for(Map.Entry<String,Integer> entry : map1.entrySet())
            {
                if(entry.getValue()>ans) ans =entry.getValue();
            }
            return ans;
    }
}*/