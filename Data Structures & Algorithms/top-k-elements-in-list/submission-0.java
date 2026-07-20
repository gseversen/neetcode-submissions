class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        //insert nums and k
        for (int index : nums) {
            map.merge(index, 1, Integer::sum);      
        }
        //loop through values
        List<int[]> freq = new ArrayList<>(); 
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            freq.add(new int[]{entry.getValue(), entry.getKey()});
        }
        //sort list
        freq.sort((a,b) -> b[0] - a[0]);

        //k freq element
        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = freq.get(i)[1];
        }
        return res;
    }
}
