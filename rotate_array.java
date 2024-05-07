import java.util.Arrays;

public class rotate_array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        rotateAndPrint(nums, 1);
        rotateAndPrint(nums, 2);
        rotateAndPrint(nums, 3);
    }

    public static void rotateAndPrint(int[] nums, int k) {
        int[] copy = Arrays.copyOf(nums, nums.length);

        rotate(copy, k);
        System.out.println("Rotate " + k + " steps to the right: " + Arrays.toString(copy));
    }

    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k % nums.length == 0) {
            return; 
        }

        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1); 
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
