public class QuickSort {


    public static void main(String[] args) {
        int[] arr = {12, 15, 16, 11, 6, 7, 2, 3, 4};
        quickSort(arr,0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low >= high) {
            return;
        }
        int leftPointer = low;
        int rightPointer = high;

       int pivot = arr[high];

        while(low < high) {

            while(arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while(arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(arr,leftPointer,rightPointer);
        }

        swap(arr,leftPointer,high);
        quickSort(arr,low,leftPointer-1);
        quickSort(arr,leftPointer + 1,high);
        print(arr);
    }

    public static void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index2] = arr[index1];
    arr[index1] = temp;
    }

    public static void print(int[] arr) {

        for(int a: arr) {
            System.out.print("[" + a + "]");
        }
        System.out.println(" ");
    }
}
