class Solution {
    public int minStartValue(int[] nums) {
     int n=nums.length;

     int sum=0;
     int mini=0;

     for(int i=0;i<n;i++){
        sum+=nums[i];
        mini=Math.min(mini,sum);
     }
     return Math.abs(mini)+1;
    }
}