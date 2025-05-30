class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        Map<String, ArrayList<String>> map = new LinkedHashMap<>();

        for (String word : arr) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());        
    }
}
