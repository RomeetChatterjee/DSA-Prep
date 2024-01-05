public class richestCustomer {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3}, //6
                {3, 5, 1}, //9
                {7, 5, 15}, //27
                {8, 5, 6} //19
        };
        int finalcheek = sum(array);
        System.out.println(finalcheek);

    }

    static int sum(int[][] arr) {
        int maxsum = Integer.MIN_VALUE;
        int checksum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            int sum =0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = arr[i][j] + sum;
            }
            if (sum > maxsum) {
                maxsum=sum;
            }
        }
        return maxsum;
    }
}

