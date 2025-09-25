public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int writePointer = 1;

        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != nums[readPointer - 1]) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }
        return writePointer;
    }
}
