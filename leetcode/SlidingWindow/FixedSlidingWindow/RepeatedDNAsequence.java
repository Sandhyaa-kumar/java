import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNAsequence {
   
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        HashMap<String,Integer> map =  new HashMap<>();
        
        for(int i=0;i<=s.length()-10;i++)
        {
            String substr = s.substring(i,i+10);
            map.put(substr,map.getOrDefault(substr,0)+1);
           }
           for(Map.Entry<String,Integer> entry : map.entrySet())
           {
            if(entry.getValue()>1)
            {
                ans.add(entry.getKey());
            }
           }
           return ans;
    }
}
//optimized
/* Set<String> seen = new HashSet<>();
 Set<String> repeated = new HashSet<>();

 for (int i = 0; i <= s.length() - 10; i++) {
     String substr = s.substring(i, i + 10);
     if (!seen.add(substr)) {
         repeated.add(substr);     }
 }
 return new ArrayList<>(repeated);*/


