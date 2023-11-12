import java.util.*;


public class FourSum {

    public static void main(String[] args) {
        int[] input = {1000000000,1000000000,1000000000,1000000000};
        for (List<Integer> i: giveAllFourSum(input, -294967296)) {
            System.out.println(i);
        }

    }

    public static List<List<Integer>> giveAllFourSum (int[] input, int target) {
        Arrays.sort(input);
        List<List<Integer>> result = new ArrayList<>();

        if (input.length < 4) return result;

        for (int i = 0; i < input.length - 3; i++) {
            for (int j = i + 1; j < input.length - 2; j++) {

                int l = j + 1;
                int r = input.length - 1;

                while (l < r) {

                    int sum = input[i] + input[j] + input[l] + input[r];

                    if (sum < target) {
                        l++;
                    } else if (sum > target) {
                        r--;
                    } else if (sum == target) {
                        // Add only when it is not in the array
                        if (!result.contains(Arrays.asList(input[i] , input[j] , input[l] , input[r]))) {
                            result.add(Arrays.asList(input[i] , input[j] , input[l] , input[r]));
                        }

                        while (l + 1 < input.length && input[l] == input[l + 1]) l++;
                        while (r - 1 > 0 && input[r] == input[r - 1]) r--;
                        l++;
                        r--;
                    }
                }
            }

        }
        return result;
    }
}
