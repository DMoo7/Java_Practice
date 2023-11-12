import java.util.*;
import java.util.stream.Collectors;

public class Triplets_Sum_Zero {

    public static List<List<Integer>> findTriplets (int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 3)
            return result;
        // sort array
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            // avoid duplicate solutions
            if (i == 0 || nums[i] > nums[i - 1]) {
               // Program Creek 35 | 181
                int negate = -nums[i];
                int start = i + 1;
                int end = nums.length - 1;
                while (start < end) {
                    //case 1
                    if (nums[start] + nums[end] == negate) {
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[start]);
                        temp.add(nums[end]);
                        result.add(temp);
                        start++;
                        end--;
                        //avoid duplicate solutions
                        while (start < end && nums[end] == nums[end + 1])
                            end--;
                        while (start < end && nums[start] == nums[start - 1])
                            start++;
                    //case 2
                    } else if (nums[start] + nums[end] < negate) {
                        start++;
                    //case 3
                    } else {
                        end--;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {

        int[] input = {-1,0,1,2,-1,-4};
        List<List<Integer>> output = findTriplets(input);

        for (List<Integer> i : output) {
            for (int j : i) {
                System.out.println(i);
            }
        }
    }
}
