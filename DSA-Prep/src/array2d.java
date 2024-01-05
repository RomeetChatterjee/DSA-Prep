import java.util.Arrays;
import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int urow,ucol;
        System.out.println("Enter the rows");
        urow = input.nextInt();
        System.out.println("Enter the colums");
        ucol = input.nextInt();
        int [][] ar = arr1(urow,ucol,input);
        for (int[] a : ar) {
            System.out.println(Arrays.toString(a));
        }
    }
    static int [][] arr1 (int row,int col, Scanner input) {
        int[][] arr = new int[row][col];
        System.out.println("Enter the values");
        for (row=0; row< arr.length; row++){
            for (col=0; col<arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
        return arr;
    }
}