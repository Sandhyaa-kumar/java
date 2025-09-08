public class NumberOfSubstringsContainingAllThreeCharacters {
     public int numberOfSubstrings(String s) {
        int[] count = new int[3]; // 0->'a', 1->'b', 2->'c'
        int left = 0, ans = 0;
        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'a']++;

            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                ans += s.length() - right;
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return ans;
    }
}
/*class Solution {
    public int numberOfSubstrings(String s) {
        int left=0,ans=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()==3){
                ans+=s.length()-i;
                char c = s.charAt(left);
                map.put(c,map.get(c)-1);
                if(map.get(c)==0) map.remove(c);
                left++;
            }

        }
        return ans;
    }
}*/