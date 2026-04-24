class Solution {
    public String encode(List<String> strs) {
        StringBuilder ns = new StringBuilder();

        for (String s : strs) 
            ns.append(s.length()).append("/").append(s);
        
        return ns.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0, j = 0;
        int len = 0;

        while (i < str.length()) {
            while (str.charAt(j) != '/') j++;

            len = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            res.add(str.substring(i, i + len));

            i = i + len;
            j = i;
        }

        return res;
    }
}
