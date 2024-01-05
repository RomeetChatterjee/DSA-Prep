public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] ans = new int[nums.length]; // Initialize ans array with appropriate size

        for (int i = 0; i <= nums.length - 1; i++) {
            ans[i] = nums[nums[i]];
        }

        // Printing the ans array elements (optional)
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
