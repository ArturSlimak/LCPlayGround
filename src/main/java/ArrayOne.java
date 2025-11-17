public class ArrayOne {
    public int[] getConcatenation(int[] nums) { //2
        int arrayLength = nums.length; //2 - 0 1 2
        int[] ans = new int[arrayLength * 2]; //4 - 0 1 2 3 4 5
        for(int i = 0; i < arrayLength; i++) { //1
            ans[i] = nums[i];
            ans[i+arrayLength] = nums[i]; //2
        }

        return ans;
    }
}
