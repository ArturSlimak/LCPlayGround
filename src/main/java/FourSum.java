import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int indexOfFirstFixedNumber = 0; indexOfFirstFixedNumber < nums.length - 2; indexOfFirstFixedNumber++) {
            if (indexOfFirstFixedNumber > 0 && nums[indexOfFirstFixedNumber] == nums[indexOfFirstFixedNumber - 1])
                continue;
            for (int indexOfSecondFixedNumber = indexOfFirstFixedNumber + 1; indexOfSecondFixedNumber < nums.length - 1; indexOfSecondFixedNumber++) {
                if (indexOfSecondFixedNumber > indexOfFirstFixedNumber + 1 && nums[indexOfSecondFixedNumber] == nums[indexOfSecondFixedNumber - 1])
                    continue;
                int leftPointer = indexOfSecondFixedNumber + 1;
                int rightPointer = nums.length - 1;

                while (leftPointer < rightPointer) {
                    long sum = (long) nums[indexOfFirstFixedNumber]
                            + nums[indexOfSecondFixedNumber]
                            + nums[leftPointer]
                            + nums[rightPointer];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[indexOfFirstFixedNumber],
                                nums[indexOfSecondFixedNumber],
                                nums[leftPointer],
                                nums[rightPointer]));
                        while (leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer + 1]) {
                            leftPointer++;
                        }
                        while (leftPointer < rightPointer && nums[rightPointer] == nums[rightPointer - 1]) {
                            rightPointer--;
                        }

                        leftPointer++;
                        rightPointer--;

                    } else if (sum < target) {
                        leftPointer++;

                    } else {
                        rightPointer--;
                    }


                }


            }
        }


        return result;
    }
}
