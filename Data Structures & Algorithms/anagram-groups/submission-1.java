class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> mapping = new HashMap<>();
        for(String input : strs) {
            //sort string
            char[] preSort = input.toCharArray();
            Arrays.sort(preSort);
            String postSort = new String(preSort);

            //add to hashmap
            mapping.computeIfAbsent(postSort, k -> new ArrayList<>()).add(input);
        }
        return new ArrayList<>(mapping.values());
    }
}
