public class missing_number {
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println("Missing number: " + missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("nums must not be null or empty");
        }

        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
}
