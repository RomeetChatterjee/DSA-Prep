import java.util.Arrays;

public class swapArray {
    public static void main(String[] args) {
        int[] arr = {2,6,7,9,5};
        swap(arr,0,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] array,int item1,int item2) {
        int temp = array[item1];
        array[item1] = array[item2];
        array[item2] = temp;
    }
}
