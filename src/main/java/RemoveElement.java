public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0)
            return 0;

        int writePointer = 0;
        for(int readPointer = 0; readPointer < nums.length; readPointer++) {
            if(nums[readPointer] != val) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }

        return writePointer;
    }
}
