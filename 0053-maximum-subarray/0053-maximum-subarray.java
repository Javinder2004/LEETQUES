class Solution {
    public int maxSubArray(int[] nums) {
      int maxSum=Integer.MIN_VALUE;
      int runningSum=0;
      int n = nums.length;
      for(int i=0;i<n;i++){
        runningSum+=nums[i];
        maxSum=Math.max(maxSum,runningSum);
        if(runningSum<0){
            runningSum=0;
        }
      }
      return maxSum;

    }
}