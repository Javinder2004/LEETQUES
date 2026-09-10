class Solution {
    public int majorityElement(int[] nums) {
    //    Arrays.sort(nums);
    //     return nums[nums.length/2]; 
//     }
// }
        int count = 0;
        int cand = 0;

        for (int x : nums) {

            if (count == 0) {
                cand = x;
            }

            if (x == cand) {
                count++;
            } else {
                count--;
            }
        }

        return cand;
    }
}