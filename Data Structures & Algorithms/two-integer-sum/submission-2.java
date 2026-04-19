class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        if(nums.length<2)
        return null;

        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hs.containsKey(nums[i]))
                return new int[]{hs.get(nums[i]), i};
            else
            hs.put(target-nums[i], i);
            
        }

        return null;
    }
}
