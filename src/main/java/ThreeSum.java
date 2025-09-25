import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        nums = Arrays.stream(nums).sorted().toArray();
        List<List<Integer>> result = new ArrayList<>();

        for (int currentNumberPointer = 0; currentNumberPointer < nums.length - 2; currentNumberPointer++) {
            if (currentNumberPointer > 0 && nums[currentNumberPointer] == nums[currentNumberPointer - 1])
                continue;

            int leftPointer = currentNumberPointer + 1;
            int rightPointer = nums.length - 1;
            int targetSum = -nums[currentNumberPointer];

            while (leftPointer < rightPointer) {
                int sum = nums[leftPointer] + nums[rightPointer];

                if (sum == targetSum) {
                    result.add(Arrays.asList(nums[currentNumberPointer], nums[leftPointer], nums[rightPointer]));
                    while (leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer + 1])
                        leftPointer++;

                    while (leftPointer < rightPointer && nums[rightPointer] == nums[rightPointer - 1])
                        rightPointer--;

                    leftPointer++;
                    rightPointer--;
                } else if (sum < targetSum) {

                    leftPointer++;

                } else {
                    rightPointer--;
                }


            }
        }

        return result;
    }
}
