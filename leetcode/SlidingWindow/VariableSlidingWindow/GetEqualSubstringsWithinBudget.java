public class GetEqualSubstringsWithinBudget {
    public int equalSubstring(String s, String t, int maxCost) {
        int left=0,cost=0,diff=0,ans=0;;
        for(int i=0;i<s.length();i++)
        {
            diff=0;
            diff = Math.abs(s.charAt(i)-t.charAt(i));
            cost+=diff;
            while(cost>maxCost)
            {
                cost=cost- Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }
            ans=Math.max(ans,i-left+1);
        }
        return ans;
    }
}
