import java.util.Arrays;

public class reverseArray {public static void main(String[] args) {
    int[] arr = {2,6,7,9,5};
    swap(arr);
    System.out.println(Arrays.toString(arr));
}
    static void swap(int[] array) {

        int start = 0;
        int end = array.length-1;
        while (start<end){
            swap(array,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] array,int item1,int item2) {
        int temp = array[item1];
        array[item1] = array[item2];
        array[item2] = temp;
    }
}
