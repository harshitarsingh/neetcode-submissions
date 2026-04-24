class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> inp = new HashMap<>();

        for(int i:nums)
        {
            inp.merge(i, 1, Integer::sum);
        }

    List<Integer> topKKeys = inp.entrySet().stream()
    .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
    .limit(k)
    .map(Map.Entry::getKey)
    .collect(Collectors.toList());

    return topKKeys.stream().mapToInt(i -> i).toArray();

    }
}
