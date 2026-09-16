class Solution {
    public boolean isAnagram(String s, String t) {
        // Solution 1 - Use map to store the count of characters and compare the maps later. O(n+m) time and space
        // Solution 2 - Use count in alphabet array with 26 chars and add count of repeated chars. O(n+m) time and O(1) space
        int[] charCounter = new int[26];
        int lenS = s.length();
        int lenT = t.length();
        int alphabetLowerValue = 97;
        if (lenS != lenT) {
            return false;
        }
        for (int i=0; i<lenS; i++) {
            charCounter[s.charAt(i) - alphabetLowerValue]++;
            charCounter[t.charAt(i) - alphabetLowerValue]--;
        }
        for (int i=0; i<charCounter.length; i++) {
            if (charCounter[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
