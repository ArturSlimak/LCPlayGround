public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int currentArea = 0;

        while (leftPointer < rightPointer) {
            int minHeight = Math.min(height[leftPointer], height[rightPointer]);
            currentArea = minHeight * (rightPointer - leftPointer);
            maxArea = Math.max(maxArea, currentArea);

            while(leftPointer < rightPointer && height[leftPointer] <= minHeight)
                leftPointer++;
            while (leftPointer < rightPointer && height[rightPointer] <= minHeight)
                rightPointer--;

        }

        return maxArea;
    }
}
