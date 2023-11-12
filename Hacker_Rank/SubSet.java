import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static  List<Integer> al = new ArrayList<>();

    public static void subSet(int[] input, int[] tempInt, int index) {

        if (index == input.length) {
            return;
        }

        // Take
//        subSet(input, tempInt + input[index], index + 1);

        // Do not take
        subSet(input, tempInt, index + 1);

    }

//    public static int[] takeInArray (int i) {
//        al.add(i);
//
//    }
}
