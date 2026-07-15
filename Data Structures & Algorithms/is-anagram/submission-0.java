class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);
        String s1Sorted = new String(s1);
        String s2Sorted = new String(s2);

        return s1Sorted.equals(s2Sorted);
    }
}
