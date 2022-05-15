public class Selection_Sort {

    public static void main(String[] args) {
        int[] a = {8,5,3,4,2,1};
        int min,temp;
        for (int i=0; i< a.length; i++) {
            min = i;

            for(int j= i + 1; j< a.length; j++) {
                if (a[i] > a[j]) {
                    min = j;
                }
            }
                temp = a[i];
                a[i] = a[min];
                a[min] = temp;
        }
        for(int b : a) {
            System.out.println(b + " ");
        }
    }
}
