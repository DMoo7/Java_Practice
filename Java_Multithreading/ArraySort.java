import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {

        int[] arr = {7,6,5,4,3,2,1};
        Arrays.sort(arr);
        for(int a : arr) {
            System.out.println(a);
        }
    }
}
