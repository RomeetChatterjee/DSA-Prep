import java.util.Arrays;
import java.util.Scanner;

public class fillinspiralOrder {
    public static void main(String[] args) {
        int[][] ar = spiral(4);
        for (int[] a : ar) {
            System.out.println(Arrays.toString(a));
        }
    }
//    public static int[][] main(String[] args) {
//        int[][] ar = spiral(3);
//        for (int[] a : ar) {
//            System.out.println(Arrays.toString(a));
//        }
//    }
    static int[][] spiral(int n){
        int r = n, c = n, counter = 1;
        int[][] arr = new int[r][c];
        int rows = arr.length;
        int cols = arr[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            // Traverse top row
            for (int i = left; i <= right; i++) {
                arr[top][i] = counter;
                counter++;
            }
            top++;

            // Traverse rightmost column
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = counter;
                counter++;
            }
            right--;

            // Check if there are rows remaining to traverse
            if (top <= bottom) {
                // Traverse bottom row
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = counter;
                    counter++;
                }
                bottom--;
            }

            // Check if there are columns remaining to traverse
            if (left <= right) {
                // Traverse leftmost column
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = counter;
                    counter++;
                }
                left++;
            }
        }

        return arr;
    }
}


//    static int [][] spiralOrder(int n){
//        int row,col;
//        int r=n,c=n,counter=1;
//        int[][] arr = new int[r][c];
//        for(row = 0;row<arr.length;row++) {
//            for (col = 0; col < arr[row].length; col++) {
//                int rows = arr.length;
//                int cols = arr[0].length;
//                int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
//                while (top<=bottom && left<=right && counter<=n*n){
//                    for (int i = left;i<=right;i++){
//                        arr[row][col] = counter;
//                        counter++;
//                    }
//                    top++;
//
//                    for (int i = top;i<=bottom;i++){
//                        arr[row][col] = counter;
//                        counter++;
//                    }
//                    right--;
//                    if (top<=bottom){
//                        for (int i = right;i>=left;i--){
//                            arr[row][col] = counter;
//                            counter++;
//                        }
//                        bottom--;
//                    }
//
//                    if (left<=right){
//                        for (int i = bottom;i>=top;i--){
//                            arr[row][col] = counter;
//                            counter++;
//                        }
//                        left++;
//                    }
//                }
//
////                if (counter<=n*n){
////                    arr[row][col] = counter;
////                    counter++;
////                }
//            }
//        }
//        return arr;
//    }
//}
