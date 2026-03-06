class Solution {
    public int trap(int[] height) {
     int l = 0;
        int r = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;
        int waterStored = 0;
      while(l<r){
        maxLeft=Math.max(maxLeft,height[l]);
        maxRight=Math.max(maxRight,height[r]);
        if(maxLeft<maxRight){
            waterStored+=(maxLeft-height[l]);
            l++;
        } else{
            waterStored+=(maxRight-height[r]);
            r--;
        }
      }
      return waterStored;
    }
}