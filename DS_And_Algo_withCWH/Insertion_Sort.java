public class Insertion_Sort {

    public static void main(String[] args) {
        int[] array = {5,2,1,7,9};
        int temp,j;

        for(int i=1; i< array.length; i++) {
            temp = array[i];
            j =i;
            while ( j > 0 && array[j - 1] > temp) {
                array[j] = array[j-1];
                j = j-1;
            }
            array[j] = temp;
        }
        for(int n=0; n< array.length; n++) {
            System.out.println(array[n] + " ");
        }
    }
}
