class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int ans=0;
        int h=-1;
        int t=0;
        while(t<n && h<m){
            while(h+1<m && nums1[t]<=nums2[h+1]){
                h++;
            }
            ans=Math.max(ans,h-t);
            if(t<=h){
                t++;
            }else{
                t++;
                h=t-1;
            }
        }
        return ans;
    }
}