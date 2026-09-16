class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length < 2) {
            return Arrays.asList(Arrays.asList(strs));
        }

        Map<Integer, List<String>> out = new HashMap<>();

        for(String str : strs) {
            int charArray = fetchStringArray(str);
            List<String> value = out.getOrDefault(charArray, new ArrayList<>());
            value.add(str);
            out.put(charArray, value);
        }
        return new ArrayList<>(out.values());
        // calculate the int value of each word and then sublist all words with same int value
    }

    private int fetchStringArray(String str) {
        int[] charArray = new int[26];
        for(char c: str.toCharArray()){
            charArray[c - 'a']++;
        }
        return Arrays.hashCode(charArray);
    }
}
