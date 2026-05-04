class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    
    List<List<Integer>> res = new ArrayList<>();
    int len = nums.length;

    Arrays.sort(nums);

    for (int k = 0; k < len - 2; k++) {

        if (k > 0 && nums[k] == nums[k - 1]) continue;

        int i = k + 1;
        int j = len - 1;

        while (i < j) {

            int sum = nums[k] + nums[i] + nums[j];

            if (sum == 0) {

                List<Integer> ls = new ArrayList<>();
                ls.add(nums[k]);
                ls.add(nums[i]);
                ls.add(nums[j]);
                res.add(ls);

                i++;
                j--;

                while (i < j && nums[i] == nums[i - 1]) i++;
                while (i < j && nums[j] == nums[j + 1]) j--;

            } else if (sum < 0) {
                i++;
            } else {
                j--;
            }
        }
    }
    return res;
}
}