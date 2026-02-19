class Solution {
    public int check(long mid,int x){
        return mid*mid>=x?1:0;
    }
    public int mySqrt(int x) {
        if(x==0||x==1)return x;
        long low=1; long high=x;
        long ans=x;
        while(low<=high){
            long mid=(low+high)/2;
            if(check(mid,x)==1){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(ans*ans==x){
            return(int)ans;
        }
        return(int)ans-1;
        
    }
}