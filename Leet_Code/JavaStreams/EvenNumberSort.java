package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumberSort {


    public static void main (String[] args) {

        List<Integer> list1 = List.of(2,40,40, 50,50,3,21);
        List<String> list2 = List.of("Aman", "Ankit", "Dishant","Vatsal");

        List<Integer> sortedList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        List<Integer> sorting = list1.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        int max = list1.stream().max(Integer::compareTo).get();
        List<String> removeDuplicate = list2.stream().distinct().collect(Collectors.toList());
        List<String> newNames = list2.stream().filter(i -> i.startsWith("A")).collect(Collectors.toList());
        String[] names = {"1", "2", "3"};
        System.out.println(sortedList);
        System.out.println(removeDuplicate);
        Stream<Object> streamEmpty = Stream.empty();
        Stream.of(names).forEach(System.out::println);
        System.out.println(newNames);
        System.out.println(max);
        System.out.println(sorting);
    }
}
