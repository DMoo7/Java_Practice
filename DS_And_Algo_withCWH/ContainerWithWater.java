// Check the array element which is max and min.
// Find the distance between that two element.
// Whichever has more distance we will consider that pair.



public class ContainerWithWater {


    public static int maxArea(int[] height) {
        int area = 0, i = 0, j = height.length - 1, res = 0 ;

        while (i < j) {
                if (height[i] <= height[j]) {
                    res =height[i] * (j - i);
                    i++;
                } else {
                    res = height[j] * (j - i);
                    j--;
                }
            if (res > area) area = res;
        }
        return area;
    }

    public static void main(String[] args) {
        int[] input = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(input);
        System.out.println(result);
    }

}
