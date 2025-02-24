q4-
solution-public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > nums[mid + 1]) {
                right = mid; // Move towards the left to find the peak
            } else {
                left = mid + 1; // Move towards the right to find the peak
            }
        }
        
        return left; // `left` will be the index of the peak element
    }

    public static void main(String[] args) {
        FindPeakElement solution = new FindPeakElement();
        int[] nums = {1, 2, 3, 1};
        int peakIndex = solution.findPeakElement(nums);
        System.out.println("The peak element index is: " + peakIndex);
    }
}
