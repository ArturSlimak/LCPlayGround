import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int p = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                p = i;
                break;
            }
        }

        if (p == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        for (int j = nums.length - 1; j > p; j--) {
            if (nums[j] > nums[p]) {
                swap(nums, j, p);
                break;
            }
        }

        reverse(nums, p + 1, nums.length - 1);


    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
