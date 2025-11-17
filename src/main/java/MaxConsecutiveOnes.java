public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            while (i < nums.length && nums[i] == 1 ) {
                i++;
                sum++;
            }
            max = Math.max(max, sum);
            sum = 0;
        }

        return max;
    }
}
