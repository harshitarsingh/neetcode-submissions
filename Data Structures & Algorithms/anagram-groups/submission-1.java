class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length <1)
        return null;

        HashMap<String, List<String>> hm = new HashMap<>();
        int count[] = new int[26];

        StringBuilder sb;
        String sep=":";
        for(String str:strs)
        {
            for(char c:str.toCharArray())
            {
                count[c-'a']++;
            }
            sb=new StringBuilder();
            for(int n:count)
            sb.append(sep).append(n); 

            hm.computeIfAbsent(new String(sb.toString()), k -> new ArrayList<>()).add(str);
            sb.delete(0, sb.length());
            Arrays.fill(count, 0);
        }

        return new ArrayList<>(hm.values());

    }
}
