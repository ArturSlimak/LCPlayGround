public class FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return new int[]{-1, -1};

        int start = 0;
        int end = nums.length - 1;
        int mid = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target) {
                break;
            } else if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }

        if (start > end)
            return new int[]{-1, -1};

        int left = mid;
        int right = mid;

        while (left >= 0 && nums[left] == target) {
            left--;
        }
        while (right < nums.length && nums[right] == target) {
            right++;
        }

        return new int[]{left + 1, right - 1};

    }
}
