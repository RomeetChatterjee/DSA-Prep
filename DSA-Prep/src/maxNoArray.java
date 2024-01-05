import java.util.Scanner;

public class maxNoArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[]arr = {2,6,8,1,3};
        System.out.println(maxi(arr));
    }
    static int maxi(int[] array) {
        int maxValue = array[0];
        for (int i=1;i<=array.length-1;i++){
            if (array[i]>maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
