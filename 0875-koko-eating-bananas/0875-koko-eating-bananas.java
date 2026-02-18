import java.util.Arrays;

class Solution {

    public boolean canFinish(int[] piles, int speed, int h) {
        long hours = 0;

        for (int bananas : piles) {
            hours += (bananas + speed - 1) / speed;
        }

        return hours <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canFinish(piles, mid, h)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}