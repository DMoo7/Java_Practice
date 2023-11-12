import java.util.Arrays;

public class TwoArrayMedian {

    public static void main(String[] args) {
        int[] num1 = {};
        int[] num2 = {1,2,3,4,5,6};

        TwoArrayMedian ins1 = new TwoArrayMedian();
       double result = ins1.findMedianSortedArrays(num1, num2);

        System.out.println(result);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] c = new int[nums1.length + nums2.length];

        int a1 = nums1.length;
        int b1 = nums2.length;

        for (int i= 0; i < a1; i++ ) {
            c[i] = nums1[i];
        }

        for (int i = 0; i < b1; i++) {
            c[a1 + i] = nums2[i];
        }
        Arrays.sort(c);
        double result = 0;
        if (c.length > 1) {
            int i = c.length;
            if (c.length % 2 == 0) {
                result = (double) (c[i/2 - 1] + c[i/2])/2;
            } else {
                result = c[i/2];
            }
        } else {
            result = c[0];
        }
        return result;
    }
}
