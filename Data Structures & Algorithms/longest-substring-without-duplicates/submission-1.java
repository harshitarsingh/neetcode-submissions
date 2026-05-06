class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> hs = new HashSet<>();
        int maxL=0;
        
        int i=0;
        for(int j=0; j<s.length(); j++)
        {
            while(hs.contains(s.charAt(j)))
            {
                hs.remove(s.charAt(i));
                i++;
            }

            hs.add(s.charAt(j));
            maxL=Math.max(maxL, j-i+1);
        }
        return maxL;
    }
}
