class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> inp = new HashMap<>();

        for (int i : nums) {
            inp.put(i, inp.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> keys = new PriorityQueue<>((a, b) -> inp.get(b) - inp.get(a));

        for (int n : inp.keySet()) keys.add(n);

        int res[] = new int[k];

        for (int i = 0; i < k; i++) res[i] = keys.poll();

        return res;
    }
}
