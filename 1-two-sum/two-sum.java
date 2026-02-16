import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store: <Number, Index>
        Map<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) { //i=0-->{2:0, 1:0, 3:2}
            int currentNumber = nums[i]; //i = 1
            int numberNeeded = target - currentNumber; //2

            // Check if the number we need is already in the map
            if (prevMap.containsKey(numberNeeded)) {//only check keys of map
                // If yes, return the index of the needed number and current index
                return new int[] { prevMap.get(numberNeeded), i };
            }

            // If no, add the current number and its index to the map
            prevMap.put(currentNumber, i);
        }

        // Return empty array if no solution is found (though problem guarantees one)
        return new int[] {};
    }
}