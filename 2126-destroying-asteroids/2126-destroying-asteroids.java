class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long pSize = mass;
        for (int i = 0; i < asteroids.length; i++) {
            if (pSize < asteroids[i]) {
                return false;
            }
            pSize += asteroids[i];
        }
        return true;
    }
} 