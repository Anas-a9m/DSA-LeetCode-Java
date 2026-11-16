class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        
     List<String> result = new ArrayList<>();

        int n = nums.length;

        if (n == 0) {
            return result;
        }

        int start = nums[0];

        for (int i = 1; i < n; i++) {

            // Check whether numbers are consecutive
            if (nums[i] != nums[i - 1] + 1) {

                // Previous range complete
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start));
                } 
                else {
                    result.add(start + "->" + nums[i - 1]);
                }

                // Start a new range
                start = nums[i];
            }
        }

        // Add the last range
        if (start == nums[n - 1]) {
            result.add(String.valueOf(start));
        } 
        else {
            result.add(start + "->" + nums[n - 1]);
        }

        return result;
    }
}