package leetcode.TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class PancakeSorting {
   
    public static void reverse(int[] arr,int end)
    {  int start=0;
        while(start<end)
        {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int size=arr.length;
        int max=0,maxindex=0;
        for(int i=size;i>1;i--)
        {  maxindex=0;
        for(int j=1;j<i;j++){
           if(arr[j]>arr[maxindex])
           {
            maxindex=j;
            
           }}
           if(maxindex!=0){
            reverse(arr,maxindex);
            ans.add(maxindex+1);
           }
           reverse(arr,i-1);
           ans.add(i);
        }
        
       return ans;
    }
   public static void main(String[] args) {
    int[] arr = {3, 2, 4, 1};
    PancakeSorting obj = new PancakeSorting();
    
    List<Integer> ans = obj.pancakeSort(arr); // return type is List<Integer>
    
    System.out.println("Pancake flip sequence: " + ans);
}

    }


