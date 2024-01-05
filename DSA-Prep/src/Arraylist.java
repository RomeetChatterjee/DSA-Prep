import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylist<T> {
    public static void main(String[] args) {
//        Arraylist<Integer> list = new Arraylist<>();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> arr = spiralMatix(matrix);
        System.out.println(arr);
    }

    static List<Integer> spiralMatix(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        while (top <= bottom && left <= right) {
            //left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);

            }
            top++; // to start the tranversal from next 'row'
            //top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // to start the tranversal from 'column'

            if (top<=bottom){  // it checks if is there any row left
            //right to left
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--; // switches to upper row
            }
            //bottom to top
            if (left<=right) { //to check if any 'column' is left
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
//                System.out.print(Arrays.toString(arr));
                }
                left++; // switches to next 'column'
            }
        }
        return result;
    }
}
