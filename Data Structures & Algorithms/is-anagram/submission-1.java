class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
        return false;

        int alpha[]=new int[26];

        for(char c:s.toCharArray())
        {
            alpha[c-'a']++;
        }

        for(char c:t.toCharArray())
        {
            alpha[c-'a']--;
        }

        for(int x:alpha)
        {
            if(x!=0)
            return false;
        }

        return true;
    }
}
