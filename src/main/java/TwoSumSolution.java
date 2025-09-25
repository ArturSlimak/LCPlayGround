import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoSumSolution {
    public int[] twoSum0n2(int[] nums, int target) {
        int numsSize = nums.length;
        for (int counter = 0; counter < numsSize; counter++) {
            for (int j = counter + 1; j < numsSize; j++) {
                if (nums[counter] + nums[j] == target)
                    return new int[]{counter, j};
            }
        }
        return null;
    }

    public int[] twoSum(int[] nums, int target) {
        int numsSize = nums.length;
        Map<Integer, Integer> map;
        map = IntStream.range(0, numsSize).boxed().collect(Collectors.toMap(i -> nums[i], i -> i, (existing, rep)-> existing));
        for (int i = 0; i < numsSize; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i)
                return new int[]{ i, map.get(complement)};
        }

        return null;
    }
}
