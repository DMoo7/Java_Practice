import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate{

    public List<Integer> removeDuplicate(int[] arr) {

        List<Integer> list = new ArrayList<Integer>();

        for (int t: arr) {
            list.add(t);
        }

	List<Integer> result = list.stream().distinct().collect(Collectors.toList());

        return result;

    }


    public static void main (String[] args) {

        int[] arr = {1,2,3,4,2,3,4};
        RemoveDuplicate inst1 = new RemoveDuplicate();
	List<Integer> result = inst1.removeDuplicate(arr);
        System.out.println(result);

    }
}