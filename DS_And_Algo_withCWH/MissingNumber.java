public class MissingNumber {

    public static void main(String[] args) {

        int a,n;

        int[] arr = {2, 3, 4,5, 6, 7, 8};
        n = arr.length;
        int total = ((n + 1) * (n + 2))/2;

        for (int i = 0; i < n; i++) {
            total -= arr[i];
        }
        System.out.println(total);
    }
}
