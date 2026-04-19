class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length <1)
        return null;

        HashMap<String, List<String>> hm = new HashMap<>();

        for(String str:strs)
        {
            char sorted[] = str.toCharArray();
            Arrays.sort(sorted);
            hm.computeIfAbsent(new String(sorted), k -> new ArrayList<>()).add(str);

        }

        List<List<String>> res = new ArrayList<>(hm.values());

        return res;

    }
}
