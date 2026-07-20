class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> mapping = new HashMap<>();
        for(String input : strs) {
            //sort string
            char[] preSort = input.toCharArray();
            Arrays.sort(preSort);
            String postSort = new String(preSort);

            //add to hashmap
            mapping.computeIfAbsent(postSort, k -> new ArrayList<>()).add(input);

            
           
        }
        //add to return
        for(List<String> val : mapping.values()) {
            result.add(val);
        }
        return result;
    }
}
