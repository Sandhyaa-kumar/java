import java.util.HashMap;

public class MininumWindowSubstring {
     public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
         HashMap<Character,Integer> window= new HashMap<>();
         int required = map.size();
         int temp=0;
         int minlen=Integer.MAX_VALUE;
        int right=0,left=0,start=0;
        for(right=0;right<s.length();right++)
        {
            char c=s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if(map.containsKey(c)&& map.get(c).equals(window.get(c)))
            {
                temp++;
            }
            while(temp==required&& left<=right)
            {
               if(right-left+1<minlen)
               {
                minlen=right-left+1;
                start=left;;
               }
                window.put(s.charAt(left),window.get(s.charAt(left))-1);
                if(map.containsKey(s.charAt(left))&&window.get(s.charAt(left))<map.get(s.charAt(left)))
                {
                    temp--;
                }
                left++;
            }
        }
       return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen); 
    } 
}
