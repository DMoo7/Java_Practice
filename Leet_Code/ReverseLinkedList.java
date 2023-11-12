import java.util.LinkedList;
import java.util.Arrays;
import java.util.function.Consumer;


public class ReverseLinkedList {

    public static void main(String[] args) {


        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int j = 0;
        for (int i = list.size() - 1; i > 0; i--) {
            if (j < list.size() - 1) list.add(j, list.get(i));
            j++;
        }

        Consumer<Integer> c = k -> System.out.println(k);

        list.forEach(c);
    }


}