import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacter {
     public int lengthOfLongestSubstring(String s) {
     HashMap<Character,Integer> map = new HashMap<>();
        int left=0,right=0,len=0;
        for(right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(map.containsKey(c))
            {
                left=Math.max(left,map.get(c)+1);
            }
            map.put(c,right);
            len=Math.max(len,right-left+1);
          
        }
          return len;
    }
}
 /* int[] freq=new int[128];
        int left=0,right=0,len=0;
        for(right=0;right<s.length();right++){
            char c=s.charAt(right);
         while(freq[c]>0){
            freq[s.charAt(left)]--;
            left++;
         }
         freq[c]++;
         len=Math.max(len,right-left+1);
        }
        return len;
        */

