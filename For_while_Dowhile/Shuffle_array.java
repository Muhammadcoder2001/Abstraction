package For_while_Dowhile;

import java.util.Arrays;

public class Shuffle_array {
    public static void main(String[] args) {
        int[] nums1 = {2, 5, 1, 3, 4, 7};
        int n1 = 3;
        int[] result1 = shuffle(nums1, n1);
        System.out.println("Output for test case 1: " + Arrays.toString(result1));  // Expected output: [2, 3, 5, 4, 1, 7]

        // Test case 2
        int[] nums2 = {1, 2, 3, 4, 4, 3, 2, 1};
        int n2 = 4;
        int[] result2 = shuffle(nums2, n2);
        System.out.println("Output for test case 2: " + Arrays.toString(result2));  // Expected output: [1, 4, 2, 3, 3, 2, 4, 1]

        // Test case 3
        int[] nums3 = {1, 1, 2, 2};
        int n3 = 2;
        int[] result3 = shuffle(nums3, n3);
        System.out.println("Output for test case 3: " + Arrays.toString(result3));  // Expected output: [1, 2, 1, 2]
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }

        return result;
    }
}
