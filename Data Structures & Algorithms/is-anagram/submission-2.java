class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> outMap = new HashMap<>();
        for(Character sChar: s.toCharArray()) {
            outMap.put(sChar, outMap.getOrDefault(sChar, 0)+1);
        }
        for(Character tChar: t.toCharArray()) {
            outMap.put(tChar, outMap.getOrDefault(tChar, 0)-1);
        }
        for(Integer val: outMap.values()) {
            if(val != 0) {
                return false;
            }
        }
        return true;
    }
}
