class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int n=nums.length;
       for(int i=0;i<n;i++){
        int result=target-nums[i];
        if(map.containsKey(result)){
            return new int[] {map.get(result),i};
        }
        map.put(nums[i],i);
       } 
       return new int[]{};
    }
}