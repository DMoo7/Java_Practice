package JavaStreams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        System.out.println(getTheSumFromArray(new int[] { 2, 5, 6 }));

        // Get The sum from an List
        System.out.println(getTheSumFromList(Arrays.asList(1, 2, 4, 5, 6)));
        System.out
                .println(getTheCountOfString(Arrays.asList(new String[] { "Helloooo", "Good night", "Good Morning" })));

        int[] nums = new int[] { 1, 2, 3, 4, 5 };
        Arrays.stream(nums).forEach(System.out::println);
        System.out.println(Arrays.stream(nums).max().getAsInt());

        System.out.println(getTheSquareOfElement(List.of(1, 2, 3, 4, 5)));

        System.out.println(conCateString(Arrays.asList(new String[] { "Helloooo", "Good night", "Good Morning" })));

        makeListUnique(Arrays.asList(new String[] { "Helloooo", "Good night", "Good Morning" }));

        checkAllSatisfy(List.of(2, 4, 6, 8));
    }

    // Get The Sum from and array using streams
    public static int getTheSumFromArray(int[] nums) {

        return Arrays.stream(nums).max().getAsInt();

    }

    // Get The sum from
    public static int getTheSumFromList(List<Integer> nums) {

        return nums.stream().reduce(0, (a, b) -> a + b);
    }

    // Find and print the count of strings that have length greater than 5.
    public static long getTheCountOfString(List<String> inputStrings) {
        long count = inputStrings.stream().filter(eachEl -> eachEl.length() > 3).count();
        inputStrings.stream().forEach(System.out::print);
        return count;
    }

    // 3. Implement a function that takes a list of integers as input and returns a
    // new list containing the square of each element.

    public static List<Integer> getTheSquareOfElement(List<Integer> input) {
        System.out.println(input.stream().mapToInt(Integer::intValue).max().getAsInt());
        return input.stream().map(each -> each * 2).collect(Collectors.toList());
    }

    // Concat string list
    public static String conCateString(List<String> input) {
        return input.stream().collect(Collectors.joining());
    }

    // Make eachString Uppercase and then Sort it into Alphabetical Order
    public static List<String> upperSortTheList(List<String> input) {
        List<String> result = input.stream().map(each -> each.toUpperCase()).sorted().toList();
        return result;
    }

    // Create a new list that contains only unique words (remove duplicates).
    public static void makeListUnique(List<String> input) {
        input.stream().filter(Objects::nonNull).toList();
        input.stream().distinct().forEach(System.out::println);
        System.out.println(input.stream().mapToInt(String::length).max().getAsInt());
    }

    // Check if all elements in a List satisfy a given condition using streams.
    // 10. Check if a list contains a specific element using streams.
    public static void checkAllSatisfy(List<Integer> nums) {
        boolean allEven = nums.stream().allMatch(each -> each % 2 == 0);
        boolean exists = nums.stream().anyMatch(each -> each.equals(9));
        System.out.println(allEven + " 9 exitsts: " + exists);
    }

}
