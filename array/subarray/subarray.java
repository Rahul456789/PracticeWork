public class subarray {
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (max < sum) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 7, 8, 9, 5 };

        System.out.println(maxSubArray(arr));
    }
}