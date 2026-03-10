class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), used, res);
        return res;
    }
    
    private void backtrack(int[] nums, List<Integer> curr, boolean[] used, List<List<Integer>> res) {
        if(curr.size() == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(used[i]) continue;
            used[i] = true;
            curr.add(nums[i]);
            backtrack(nums, curr, used, res);
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}