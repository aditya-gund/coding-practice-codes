import java.util.HashMap;
import java.util.Map;

class twoSum {
    public static int[] twoSumFun(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            
            // Check if the difference exists in the map
            if (map.containsKey(diff)) {
                ans[0] = map.get(diff);  // index of the previously stored number
                ans[1] = i;              // current index
                break;  // Found the solution, so break out of the loop
            }
            
            // Store the current number and its index in the map
            map.put(nums[i], i);
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] indices = twoSumFun(nums, target);
        System.out.println("Indices: [" + indices[0] + ", " + indices[1] + "]");
    }    
}
