public class findMin {
    public static void main(String[] args) {
        int[] arr = {12,56,78,6,46,9,54,6,1,2,3};
        int afterCheck = findMin(arr);
        System.out.print(afterCheck);

    }
    static int findMin(int[] array) {
        int minVal = array[0];
        for (int i=0;i<=array.length-1;i++) {
            if (array[i] < minVal) {
                minVal = array[i];
            }
        }
        return minVal;
    }
}
