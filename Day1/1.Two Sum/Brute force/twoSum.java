class twoSum{
    public static int[] twoSumFun(int[] nums, int target) {
        // Length of the nums array
        int len=nums.length;
        //intializing the result array to store the results
        int[] result = new int[2];
        // Outer Loop start from 0th index and runs upto the last index value of the arary
        for(int i=0;i<=len-1;i++){
            // Inner loop start from the 1st index run until the last index of the array
            for(int j=i+1;j<=len-1;j++){
                // Check if prev index value and curr value is == target value
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] indices = twoSumFun(nums, target);
        System.out.println("Indices: [" + indices[0] + ", " + indices[1]+"]");
    }    
}