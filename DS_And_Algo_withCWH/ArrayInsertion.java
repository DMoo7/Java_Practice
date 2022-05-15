public class ArrayInsertion {

    public void display(int[] arr) {
        for(int a: arr) {
            System.out.println(a);
        }
    };

    public int[] insertion(int[] arr,int size,int element,int index,int arrLength) {
        int[] result = {-1};
        if(size > arrLength) {
            for(int i = arrLength - 1; i >= index; i--) {
                arr[i+1] = arr[i];
            }
            arr[index] = element;
            result = arr;
        }
        return  result;
    };

    public static void main(String[] args) {

        int size = 100, element = 45, index = 3;
        int[] arr = new int[size];
        arr[0] = 7;
        arr[1] = 8;
        arr[2] = 12;
        arr[3] = 88;

        ArrayInsertion addElementToArray = new ArrayInsertion();
        int[] result = addElementToArray.insertion(arr,size,element,index,4);
        if(result.equals(-1) != true) {
            addElementToArray.display(result);
            size += 1;
        } else {
            System.out.println("Array Insertion failed");
        }
    };

}
