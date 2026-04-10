class Solution {
    public int characterReplacement(String s, int k) {
        int[]frq=new int[26];
        int head=0;
        int maxF=0;
        int maxL=0;
        for (int tail=0;tail<s.length();tail++){
            char ch=s.charAt(tail);
            frq[ch-'A']++;
            maxF=Math.max(maxF,frq[ch-'A']);
            while((tail-head+1)-maxF>k){
                frq[s.charAt(head) - 'A']--;
                head++;
            }
            maxL=Math.max(maxL,tail-head+1);
        }
        return maxL;
    }
}