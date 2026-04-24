class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int prefix[] = new int[len];
        int suffix[] = new int[len];
        prefix[0] = 1;
        ;
        suffix[len - 1] = 1;
        for (int i = 1; i < len; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
            suffix[len - 1 - i] = suffix[len - i] * nums[len - i];
        }

        int ans[] = new int[len];

        for (int i = 0; i < len; i++) {
            ans[i] = prefix[i] * suffix[i];
        }

        return ans;
    }
}
