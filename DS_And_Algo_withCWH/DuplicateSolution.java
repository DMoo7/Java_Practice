import java.util.Arrays;

public class DuplicateSolution {


    public static boolean containsDuplicate(int[] nums) {

        boolean isDup = false;
        Arrays.sort(nums);
        for(int i = 0 ; i <nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                isDup = true;
                break;
            }
        }
        return isDup;
    }

    public static void main (String[] args) {

        int[] input = {0,5,-2,0,-4};
        boolean result = containsDuplicate(input);
        System.out.println(result);
    }



}