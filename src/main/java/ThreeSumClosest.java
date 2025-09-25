import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int currentNumberPointer = 0; currentNumberPointer < nums.length; currentNumberPointer++) {
            if (currentNumberPointer > 0 && nums[currentNumberPointer] == nums[currentNumberPointer - 1])
                continue;

            int leftPointer = currentNumberPointer + 1;
            int rightPointer = nums.length - 1;

            while (leftPointer < rightPointer) {

                int currentSum = nums[currentNumberPointer] + nums[leftPointer] + nums[rightPointer];

                if (currentSum == target) {
                    return currentSum;
                } else if (currentSum < target) {
                    leftPointer++;
                } else {
                    rightPointer--;
                }

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }


            }
        }

        return closestSum;
    }
}
