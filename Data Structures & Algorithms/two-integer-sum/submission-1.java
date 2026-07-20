class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            
            for (int j = 0; j < length; j++) {
                
                if (i != j && (nums[i] + nums[j] == target)) {
                   
                    if( i > j ) {
                        result[0] = j;
                        result[1] = i;
                   }else{
                        result[0] = i;
                        result[1] = j;
                   }
                   return result;
                }
            }
        }
        return result;
    }
}
