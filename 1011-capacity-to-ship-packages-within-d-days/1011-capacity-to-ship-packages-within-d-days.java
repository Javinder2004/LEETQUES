class Solution {
    public int check(int[]nums,int mid,int days){
        int dayCnt=1;
        int load=0;
        for(int i=0;i<nums.length;i++){
            if(load+nums[i]>mid){
                dayCnt++;
                load=nums[i];
            }else{
                load+=nums[i];
            }
        }
         return dayCnt<=days?1:0;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=Arrays.stream(weights).max().getAsInt();
        int high=Arrays.stream(weights).sum();
        int ans=low;
        while(low<=high){
            int mid=(low+high)/2;
            if(check(weights,mid,days)==1){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
         return ans;
    }
}