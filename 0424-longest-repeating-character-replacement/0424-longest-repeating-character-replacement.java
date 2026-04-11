class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // Add current character
            count[s.charAt(right) - 'A']++;
            
            // Track max frequency
            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);

            // If invalid window → shrink
            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            // Update result
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}