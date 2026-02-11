class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
       int ans[] = new int[n];
       int prodofl = 1;
         int prodofr = 1;
         for( int i = n-1; i>=0; i-- ){
            ans[i] = prodofr;
prodofr = prodofr * nums[i];

         }
         for( int i =0; i<n; i++ ){
            ans[i] =ans[i]*prodofl;
prodofl = prodofl * nums[i];
 
         }
         return ans;

    }
}