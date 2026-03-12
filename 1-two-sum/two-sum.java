class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) { //i=0-->{2:0}
            int currentNumber = nums[i]; //i = 1
            int numberNeeded = target - currentNumber; //7

            if (m.containsKey(numberNeeded)) {//only check keys of map
                return new int[] { m.get(numberNeeded), i };
            }

            m.put(currentNumber, i);
        }
        return new int[] {};
    }
}