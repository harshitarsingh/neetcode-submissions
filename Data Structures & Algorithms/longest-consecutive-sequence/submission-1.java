class Solution {
    public int longestConsecutive(int[] nums) {

       Set<Integer> numbers = new HashSet<>();

       for(int i:nums)
       numbers.add(i);

        int len;
        int res=0;
       for(int i:numbers)
       {
        len = 1;
        if(!numbers.contains(i-1))
        {
            while(numbers.contains(i+len))
            len+=1;
        }
        res = Math.max(res, len);
       } 

       return res;
    }
}
