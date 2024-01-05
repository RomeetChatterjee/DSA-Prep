import java.util.Arrays;
import java.util.Scanner;

public class findin2dArray {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        int [][] array = {
                {12,56,45,7},
                {2,5,96,},
                {94,5,6,47,8}
        };
//        System.out.print("Item to search ");
//        int target = in.nextInt();
//        int[] afterCheck = find(array,target);
        int maxValue = findMax(array);
        System.out.print(maxValue);
//        System.out.println(Arrays.toString(afterCheck));
    }

    static int findMax(int[][] arr) {
        int i,j;
        int maxValue = arr[0][0];
        for (i=0;i<=arr.length-1;i++){
            for (j=0;j<arr[i].length;j++){
                if (arr[i][j] >maxValue) {
                    maxValue = arr[i][j];
                }
            }
        }
        return maxValue;
    }

//    static int[] find(int[][] arr,int target) {
//        int i,j;
//        for (i=0;i<=arr.length-1;i++){
//            for (j=0;j<arr[i].length;j++){
//                if (arr[i][j] == target) {
//                    return new int[]{i,j};
//                }
//            }
//        }
//        System.out.println("Item not found");
//        return new int[]{-1,-1};
//    }
}
