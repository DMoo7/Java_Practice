import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstTwoSum {
        public int[] twoSum(int[] nums, int target) {
            int[] output = new int[2];
            Map<Integer,Integer> map = new HashMap<>();
            for(int i=0; i<nums.length; i++) {
                if(map.containsKey(target - nums[i])) {
                    output[1] = i;
                    output[0] = map.get(target - nums[i]);
                    return output;
                }
                map.put(nums[i],i);
            }
            return output;
        }

    public static void main(String[] args) {
        int[] input = {3,2,4};
        FirstTwoSum test = new FirstTwoSum();
        int[] output = test.twoSum(input,6);
      for(int a: output) {
          System.out.println(a);
      }
    }
}
