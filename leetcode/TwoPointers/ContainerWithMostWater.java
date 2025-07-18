package leetcode.TwoPointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,area=0;
        while(i<j){
             area=Math.max(area,Math.min(height[i],height[j])*(j-i));
             if(height[i]<height[j]){
                i++;
             }
             else
             j--;
        }
        return area;
    }
    public static void main (String[] args)
    {
       
      int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
      ContainerWithMostWater obj = new ContainerWithMostWater();
      int ans = obj.maxArea(arr);
      System.out.println("Max Area = " + ans);
    }
}
